package org.example.Networking.DaroClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class HttpServerWithIO {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);

        while(true){
            try(Socket socket = serverSocket.accept()){
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String responseHeaderLine1 = bufferedReader.readLine();
                System.out.println(responseHeaderLine1);
                String endpoint = responseHeaderLine1.split(" ")[1];  // ask Daro

                if (endpoint.equals("/")){
                    socket.getOutputStream().write(("HTTP/1.1 200 OK\r\n\r\n" +
                            "<html><h1>Welcome to Homepage</h1>" +
                            "<main><h2>Network Socket Communication.</h2>" +
                            "<img alt='' diagram illustrating socket communication" +
                            "src=''https://www.cs.dartmouth.edu/~campbell/cs50/wan.jpg>"+
                            "</main></html").getBytes(StandardCharsets.UTF_8));
                }
                else{
                    socket.getOutputStream().write(("HTTP/1.1 200 OK" + "\r\n\r\n" +  "<html>"+"404 This page was not found."+"</html>").getBytes(StandardCharsets.UTF_8));
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
