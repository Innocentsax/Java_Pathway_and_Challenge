package org.example.HttpServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServerWithIO {

/*
Go to a new tab in your browser and paste localhost:8080
 */

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8080);



        while (true) {

            try (Socket socket = serverSocket.accept()) {

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));



                String responseHeaderLine1 = bufferedReader.readLine();

                System.out.println(responseHeaderLine1);

                String endpoint = responseHeaderLine1.split(" ")[1];

                if (endpoint.equals("/")) {

                    socket.getOutputStream()

                            .write(("HTTP/1.1 200 OK" + "\r\n\r\n" + "<html>"+
                                    "<h1>"+
                                    "Welcome to HomePage"+
                                    "</h1>"+
                                    "<main>" +
                                    "<h2>"+
                                    "Network Socket communication." +
                                    "</h2>" +
                                    "<img alt='"+
                                    "diagram illustrating socket communication'" +
                                    "src='" +
                                    "https://www.cs.dartmouth.edu/~campbell/cs50/wan.jpg'>"
                                    +"</main>"+
                                    "</html>")

                                    .getBytes("UTF-8"));

                } else {

                    socket.getOutputStream()

                            .write(("HTTP/1.1 200 OK" + "\r\n\r\n" +  "<html>"+"404 This page was not found."+"</html>")

                                    .getBytes("UTF-8"));

                }

            } catch (IOException exception) {

            }

        }

    }

}
