package org.example.ChatUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class DatagramA {

    public static void main(String[] args) throws IOException {
        byte[] data = new byte[755555];
        DatagramSocket receiverSocket = new DatagramSocket(8080);
        DatagramSocket senderSocket = new DatagramSocket();
        DatagramPacket datagramPacketReceiver;
        DatagramPacket datagramPacketSender;
        Scanner scanner = new Scanner(System.in);

        while(true){
            //instantiating a receiver packet object
            datagramPacketReceiver = new DatagramPacket(data, data.length);
            receiverSocket.receive(datagramPacketReceiver);

            //reading received data to stringBuilder
            StringBuilder messgage = new StringBuilder();

            //creating a loop int for looping through data array
            int i = 0;

            //while loop to read byte characters into string via stringBuilder append method
            while(data[i]!=0){
                messgage.append((char) data[i]);
                i++;
            }

            //refreshing our byte array
            data = new byte[755555];

            //print out data
            System.out.println("Received:- "+messgage);

            //sending data process below...

            //receiving message from the system input via scanner into a string object
            String messageToSend = scanner.nextLine();

            //initialising a sender packet object with ip and port for location process destination
            datagramPacketSender =  new DatagramPacket(messageToSend.getBytes(),
                    messageToSend.length(), InetAddress.getLocalHost(), 8081);

            //sending packet via sender socket
            senderSocket.send(datagramPacketSender);

            //refreshing data byte array
            data = new byte[755555];

        }



    }
}
