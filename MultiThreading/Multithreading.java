package org.example.MultiThreading;

public class Multithreading extends Thread{
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE  + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println(ThreadColor.ANSI_BLUE + "Another thread woke me up");
            return;
        }
        System.out.println(ThreadColor.ANSI_BLUE + "Three seconds have passed and I'm awake" );
    }
}
