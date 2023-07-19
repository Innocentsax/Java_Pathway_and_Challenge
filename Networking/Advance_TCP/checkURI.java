package org.example.Networking.Advance_TCP;

import java.net.URI;
import java.net.URISyntaxException;

public class checkURI {
    public static void main(String[] args) throws URISyntaxException {
        URI webURI = new URI("https", "en.wikipedia.org", "/wiki/URL_normalization", "Normalization_Proccess");
        getURI(webURI);
    }
    static void getURI(URI myUri){
        System.out.println(myUri.getAuthority());
        System.out.println(myUri.getPath());
        System.out.println(myUri.getHost());
        System.out.println(myUri.getPort());
        System.out.println(myUri.getScheme());
        System.out.println(myUri.getQuery());
    }
}
