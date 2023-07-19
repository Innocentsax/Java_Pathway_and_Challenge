package org.example.Networking.TCP_MultiThreading;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable{
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try{
            BufferedReader inSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter outSocket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

            outSocket.println("Welcome!! what's your name: ");
            String message = inSocket.readLine();
            System.out.println("Client says: " + message);

            socket.close();
            System.out.println("Socket is closed");
        }catch(Exception e){
            // Checker
        }
    }
}
