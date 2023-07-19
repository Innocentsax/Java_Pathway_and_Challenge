package org.example.Networking;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try{
            new Client();
        }catch(Exception e){
            // Check for the error
        }
    }

    public Client() throws IOException {
        Socket socket = new Socket("localhost", 2020);
        System.out.println("Successful connection to the server");

        // I/O stream
        BufferedReader inSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter outSocket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

        String message = inSocket.readLine();
        System.out.println("Server says: " + message);
        outSocket.println("Thanks");

        socket.close();
        System.out.println("Socket closed.");
    }
}
