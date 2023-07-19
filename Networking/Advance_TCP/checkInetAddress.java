package org.example.Networking.Advance_TCP;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class checkInetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress names[] = InetAddress.getAllByName("udemy.com");

        for(InetAddress name : names){
            System.out.println(name);
        }
    }
}
