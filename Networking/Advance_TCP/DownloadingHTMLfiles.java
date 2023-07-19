package org.example.Networking.Advance_TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class DownloadingHTMLfiles {
    public static void main(String[] args) throws IOException {
        try{
            URL url = new URL("https://ocsaly.com");
            URLConnection myUrlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(myUrlConnection.getInputStream()));
            String myLine;
            while((myLine=bufferedReader.readLine()) != null){
                System.out.println(myLine);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
