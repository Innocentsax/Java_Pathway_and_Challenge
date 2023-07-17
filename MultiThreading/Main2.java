package org.example.MultiThreading;

public class Main2 {
    public static void main(String[] args) {
        CountDown countDown = new CountDown();

        CountDownThread t1 = new CountDownThread(countDown);
        t1.setName("Thread 1");
        CountDownThread t2 = new CountDownThread(countDown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

class CountDown{
    private int i;

    public void doCountDown(){
        String color;
        switch (Thread.currentThread().getName()){
            case "Thread 1": color = ThreadColor.ANSI_CYAN;break;
            case "Thread 2": color = ThreadColor.ANSI_PUPPLE;break;
            default: color=ThreadColor.ANSI_BLACK;
        }
        synchronized (this){
            for( i = 10; i > 0; i --){
                System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
            }
        }
    }
}

class CountDownThread extends Thread{
    private CountDown threadCountDown;

    public CountDownThread(CountDown countDown){
        threadCountDown = countDown;
    }

    public void run(){
        threadCountDown.doCountDown();
    }
}