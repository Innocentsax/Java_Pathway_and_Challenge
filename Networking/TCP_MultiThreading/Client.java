package org.example.Networking.TCP_MultiThreading;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public Client() throws IOException {
        Socket socket = new Socket("127.0.0.1", 2020);
        System.out.println("Successful connection to the server");

        // I/O stream
        BufferedReader inSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter outSocket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

        Scanner keyboard = new Scanner(System.in);
        String message = inSocket.readLine();
        System.out.println("Server says: " + message);
        message = keyboard.nextLine();
        outSocket.println();

        socket.close();
        System.out.println("Socket closed.");
    }
    public static void main(String[] args) {
        try{
            new Client();
        }catch(Exception e){
            // Check for the error
        }
    }


}
