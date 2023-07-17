package org.example.MultiThreading;

public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_CYAN + "Hello from the main Thread");

        Thread anotherThread = new Multithreading();
        anotherThread.setName("==Another Thread==");
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ThreadColor.ANSI_PUPPLE + "Hello from the anonymous class thread");
            }
        }.start();

        Thread threadRunnable = new Thread(new ThreadRunnable() {
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_RED + "Hello from ThreadRunnable's implementation of run");
                try {
                    anotherThread.join(2000);
                    System.out.println(ThreadColor.ANSI_RED + "Another Thread terminated or time out, so am running again");
                } catch (InterruptedException e) {
                    System.out.println(ThreadColor.ANSI_RED + "I could'nt wait after all. I was interrupted");
                }
            }
        });
        threadRunnable.start();


        System.out.println(ThreadColor.ANSI_GREEN + "Hello again from the main thread ");
    }
}
