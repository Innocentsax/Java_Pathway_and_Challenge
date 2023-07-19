package org.example.Networking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            new Server();
        }catch(Exception e){
            //Check out the errors
        }
    }

    public Server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(2020); // Opening a new port
        System.out.println("Port 2020 is Open");

        Socket socket = serverSocket.accept();
        System.out.println("Client " + socket.getInetAddress() + " has connected");

        // I/O Buffer
        BufferedReader inSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter outSocket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

        outSocket.println("Welcome"); // Send "Welcome" to the Client
        String message = inSocket.readLine(); // Received "Thanks"
        System.out.println("Client says: " + message); // Display client's message is the console

        socket.close();
        System.out.println("Socket is closed");

    }
}
