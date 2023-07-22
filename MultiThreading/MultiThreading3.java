package org.example.Threads;

public class MultiThreading3{
    public void addNumber() throws  InterruptedException{
        Runnable runnable = ()->{
            for (int i = 0; i < 100; i++) {
                Multithreading.totalValue.getAndAdd(1);
                Multithreading.totalValue.set(Multithreading.totalValue.get());
//                System.out.println("Thread number "+3+"="+Multithreading.totalValue.get());
//                Multithreading.totalValue.getAndIncrement();
                System.out.println(3+" has added 1 and the total is: "+Multithreading.totalValue.get());
            }

            System.out.println("Total value = "+Multithreading.totalValue.get());
        };
        Thread thread = new Thread(runnable);
        thread.start();
//        thread.join();
    }
}
