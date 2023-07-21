package org.example.ChatUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class DatagramB {

    public static void main(String[] args) throws IOException {
        byte[] data = new byte[755555];
        DatagramSocket receiverSocket = new DatagramSocket(8081);
        DatagramSocket senderSocket = new DatagramSocket();
        DatagramPacket datagramPacket;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //sending data process below
            String messageToSend = scanner.nextLine();
            datagramPacket = new DatagramPacket(messageToSend.getBytes(),
                    messageToSend.length(), InetAddress.getLocalHost(), 8080);
            senderSocket.send(datagramPacket);
            data = new byte[755555];

            //receiving data process below
            datagramPacket = new DatagramPacket(data, data.length);
            receiverSocket.receive(datagramPacket);
            StringBuilder message = new StringBuilder();
            int i = 0;
            while (data[i] != 0) {
                message.append((char) data[i]);
                i++;
            }
            data = new byte[755555];

            System.out.println("Received:- " + message);

        }
    }
}
