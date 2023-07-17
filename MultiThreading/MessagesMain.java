package org.example.MultiThreading;

import java.util.Random;

public class MessagesMain {
    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
    }
}

class Message{
    private String message;
    private boolean empty = true;

    public synchronized String read(){
        while(empty){
            try{
                wait();
            }catch(InterruptedException e){

            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void write(String message){
        while(!empty){
            try{
                wait();
            }catch(InterruptedException e){

            }
        }
        empty = false;
        this.message = message;
        notifyAll();
    }
}

class Writer implements Runnable{
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String messages[] = {
               "Hi, Am Innocent Udo, a skilled Java Software Developer with a passion for building robust and ",
                "scalable applications. With a solid background in Software Engineering and hands-on",
                "experience in Java, I excel in implementing efficient solutions and optimizing code.",
                "My dedication to continuous learning and problem-solving makes me a valuable asset to",
                "any development team. With a keen eye for detail and a commitment to delivering high-.",
                "quality work, It consistently exceeds expectations in software development projects.",
                ""
        };
        Random random = new Random();
        for(int i=0; i< messages.length; i++){
            message.write(messages[i]);
            try{
                Thread.sleep(random.nextInt(2000));
            }catch(InterruptedException e){

            }
        }
        message.write("Finished");
    }
}

class Reader implements Runnable{
    private Message message;

    public Reader(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        Random random = new Random();
        for(String latestMessage = message.read(); !latestMessage.equals("Finished"); latestMessage = message.read()){
            System.out.println(latestMessage);

            try{
                Thread.sleep(random.nextInt(2000));
            }catch (InterruptedException e){

            }
        }
    }
}
