package org.example.Networking.Advance_TCP;

import java.io.IOException;
import java.net.InetAddress;

public class Main {
    public static void main(String[] args) throws IOException {

        InetAddress udemyName = InetAddress.getByName("www.udemy.com"); // Getting the internet Address of Udemy
        System.out.println("HOST ADDRESS                        " + udemyName.getHostAddress());
        System.out.println("CANONICAL HOST NAME: " + udemyName.getCanonicalHostName());
        System.out.println("HOST NAME:                              " + udemyName.getHostName());

        udemyName.isReachable(1000);
    }
}
