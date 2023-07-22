package org.example.Threads;

public class DeadLock extends Thread{

    private final String lock1 = new String();
    private final String lock2 = new String();
    private int threadNo;

    public int getThreadNo() {
        return threadNo;
    }

    public void setThreadNo(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        Thread thread =  new Thread(()-> {
            synchronized (lock1) {
                System.out.println("Thread no " + 4 + " has lock 1");
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                    System.out.println("Thread no " + 4 + " has lock 2");
                }
            }
        });
        Thread thread2 =  new Thread(()-> {
            synchronized (lock2) {
                System.out.println("Thread no " + 5 + " has lock 2");
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1) {
                    System.out.println("Thread no " + 5 + " has lock 1");
                }
            }
        });
        thread.start();
        thread2.start();
        }
    }
