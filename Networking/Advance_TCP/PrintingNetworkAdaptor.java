package org.example.Networking.Advance_TCP;

import java.io.IOException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

public class PrintingNetworkAdaptor {
    public static void main(String[] args) throws SocketException {
        try{
            Enumeration<NetworkInterface> networkInterfaceEnumeration = NetworkInterface.getNetworkInterfaces();
            System.out.println("Network Display :  \n");
            for(NetworkInterface element : Collections.list(networkInterfaceEnumeration)){
                System.out.printf("%-8s  %-32s  \n", element.getName(), element.getDisplayName());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
