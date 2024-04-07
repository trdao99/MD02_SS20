package bai5;

import static bai5.bai5.i;

public class thread1 implements Runnable{
    @Override
    public synchronized void run() {
        for (int j = 0; j < 10; j++) {
            System.out.println("thread1: "+ (i = i + 1));
        }
    }
}