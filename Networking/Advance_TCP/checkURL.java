package org.example.Networking.Advance_TCP;

import java.net.MalformedURLException;
import java.net.URL;

public class checkURL {
    public static void main(String[] args) throws MalformedURLException {
        String web = "https://en.wikipedia.org/wiki/URL#Citation";

        URL myUrl = new URL(web);
        getURL(myUrl);
    }
    static void getURL(URL url){
        System.out.println("HOST = " + url.getHost());
        System.out.println("PATH = " + url.getPath());
        System.out.println("REF = " + url.getRef());
    }
}
