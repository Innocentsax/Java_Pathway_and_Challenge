package org.example.Threads;

import java.util.concurrent.atomic.AtomicInteger;

//CRON JOBS: These unit processes that are tasked to carry out a behaviour/logic after a set period
//or to repeat a task at set intervals. Cron job basically help us with Scheduling.
public class Multithreading extends Thread{
    static AtomicInteger totalValue = new AtomicInteger(0);
//    static int totalValue;

    //ATOMIC
    //main thread original = 100
    //thread 1 copies 100 and adds 1 = 101
    //thread 1 original = 101
    //thread 2 copies 100 and adds 1 = 101
    //thread 2 original = 101
    //101
    //101
    private int threadNo;

    public int getThreadNo() {
        return threadNo;
    }

    public void setThreadNo(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
//            totalValue++;
//            try {
//
//                Thread.sleep(2000);
//            }
//            catch (InterruptedException e){
//                System.out.println(e.getMessage());
//            }
        totalValue.getAndAdd(1);
        totalValue.set(totalValue.get());
//            totalValue.getAndIncrement();
            System.out.println("thread "+threadNo+" has added 1 and the total is: "+totalValue.get());
    }
    }
    public static void main(String[] args) throws InterruptedException {


        Multithreading multithreading = new Multithreading();
        Multithreading multithreading1 = new Multithreading();
        MultiThreading3 multiThreading3 = new MultiThreading3();
        multithreading.setThreadNo(1);
        multithreading1.setThreadNo(2);
        DeadLock deadLock =  new DeadLock();
        deadLock.setThreadNo(4);

        multithreading.start();
        multithreading1.start();
        multithreading.join();
        multithreading1.join();
        multiThreading3.addNumber();
        System.out.println(totalValue.get());
        deadLock.start();
    }

}
