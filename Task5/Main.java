package org.example.Task5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static final int threadSize = 10;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server started on port 8080");
        ExecutorService executorService = Executors.newFixedThreadPool(threadSize);
        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            executorService.submit(() -> handleRequest(clientSocket));
        }
    }
    private static void handleRequest(Socket clientSocket) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String requestLine = reader.readLine();
            System.out.println("Request: " + requestLine);

            System.out.println(requestLine);
            String[] requestParts = requestLine.split(" ");
            System.out.println(Arrays.toString(requestParts));
            String path = requestParts[1];

            StringBuilder responseBuilder = new StringBuilder();
            String contentType;
            if (path.equals("/")) {

                contentType = "text/html";
                String htmlContent = "<html>" +
                        "<head>" +
                        "<title>Backend  with webservers</title>" +
                        "</head> " +
                        "<body style='background-color:aquamarine';>" +
                        "<h1 style='color:purple'>Week 5 task == Webserver == Author: INNOCENT UDO (DecaDev)</h1>" +
                        "<img style='width:500px; height:auto' src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRfSOhZPlWE_iAc7iU1iBcztyzTaLIBAOKsTA&usqp=CAU'/>"+
                        "<p>Java is amazing</p>" +
                        "<p>DOING HARD THINGS</p>" +
                        "</body>" +
                        "</html>";
                responseBuilder.append(htmlContent);
            } else if (path.equals("/json")) {
                contentType = "application/json";
                Map<String, String> jsonObject = new HashMap<>();
                jsonObject.put("message", "Hello, JSON!");


                String jsonResponse = "{\"message\":\"Hello, JSON!\",\"data\":\"Hi from INNOCENT UDO at the backend\"}";
                responseBuilder.append(jsonResponse);
            } else {
                // Invalid path - Return 404 Not Found
                contentType = "text/plain";
                String errorResponse = "404 Not Found";
                responseBuilder.append(errorResponse);
            }
            StringBuilder httpResponse = new StringBuilder();
            httpResponse.append("HTTP/1.1 200 OK\r\n");
            httpResponse.append("Content-Type: " + contentType + "\r\n");
            httpResponse.append("Content-Length: " + responseBuilder.length() + "\r\n\r\n");
            httpResponse.append(responseBuilder);

            // Send the response to the client
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            writer.write(httpResponse.toString());
            writer.flush();

            // Close the client connection
            //clientSocket.close();
            System.out.println("Client disconnected");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
