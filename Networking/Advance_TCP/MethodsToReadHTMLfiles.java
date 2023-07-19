package org.example.Networking.Advance_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class MethodsToReadHTMLfiles {
//    URLConnection;
//    ReadableByteChannel;
//    ByteBuffer;

    public static void main(String[] args) throws IOException {
        try{
            URL url = new URL("https://ocsaly.com");
            URLConnection urlConnection = url.openConnection();

            InputStream inputStream = urlConnection.getInputStream();
            ReadableByteChannel readableByteChannel = Channels.newChannel(inputStream);
            ByteBuffer buffer = ByteBuffer.allocate(64);

            String line = null;
            while(readableByteChannel.read(buffer) > 0){
                System.out.println(new String(buffer.array()));
                buffer.clear();
            }

            readableByteChannel.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
