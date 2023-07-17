package org.example.MultiThreading;

import static org.example.MultiThreading.ThreadColor.ANSI_RED;

public class ThreadRunnable  implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from ThreadRunnable's implementation of run");
    }
}
