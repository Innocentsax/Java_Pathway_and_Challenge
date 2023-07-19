package org.example.Networking.Advancing;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try{
            new Client();
        }catch(Exception e){
            // Check for the error
        }
    }

    public Client() throws IOException {
        Socket socket = new Socket("127.0.0.1", 2020);
        System.out.println("Successful connection to the server");

        // I/O stream
        BufferedReader inSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter outSocket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

        Scanner keyboard = new Scanner(System.in);
        String userNumber;
        while((inSocket.readLine()).startsWith("Guess")){
            System.out.println("Server says: Guess a number [1-10].");
            userNumber = keyboard.nextLine();
            outSocket.println(userNumber);
        }
        System.out.println("You got it!!!");
//        String message = inSocket.readLine();
//        System.out.println("Server says: " + message);
//        System.out.print("Say something to the server: ");
//        message = keyboard.nextLine(); // User is prompted to type a message for the server
//        outSocket.println(message);

        socket.close();
        System.out.println("Socket closed.");
    }
}
