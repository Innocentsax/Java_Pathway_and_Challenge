package org.example.Networking.CHATtcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        ServerSocket serverSocket = new ServerSocket(2020);

        while(true){
            try{
                socket = serverSocket.accept();
                inputStreamReader = new InputStreamReader(socket.getInputStream());
                outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());

                bufferedReader = new BufferedReader(inputStreamReader);
                bufferedWriter = new BufferedWriter(outputStreamWriter);

                while(true){
                    String messageFromClient = bufferedReader.readLine();
                    System.out.println("Client says: " + messageFromClient);

                    bufferedWriter.write("Message Received");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();

                    if (messageFromClient.equalsIgnoreCase("BYE")){
                        break;
                    }
                }
            }catch(IOException e){
                e.printStackTrace();
            }
            finally {
                try{
                    if(socket != null){
                        socket.close();
                    }
                    if(inputStreamReader != null){
                        inputStreamReader.close();
                    }
                    if(outputStreamWriter != null){
                        outputStreamWriter.close();
                    }
                    if(bufferedReader != null){
                        bufferedReader.close();
                    }
                    if(bufferedWriter != null){
                        bufferedWriter.close();
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
