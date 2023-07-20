package org.example.ChatTCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {

    public static void main(String[] args) {
        final String SERVER_IP = "localhost";
        final int PORT = 8080;

        try (Socket socket = new Socket(SERVER_IP, PORT)) {
            System.out.println("Connecting to Server...");
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Input Stream connected...");
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            System.out.println("Output Stream connected");
            Thread serverListener = new Thread(() -> {
                System.out.println("Thread created...");
                try {
                    String serverMessage;
                    System.out.println("Now transmitting messages");
                    System.out.println("-------------------------");
                    System.out.println();
                    while ((serverMessage = in.readLine()) != null) {
                        System.out.println("Server: " + serverMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            serverListener.start();

            BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

            String userInput;
            while ((userInput = consoleInput.readLine()) != null) {
                out.println(userInput);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
