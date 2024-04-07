package bai5;

import static bai5.bai5.i;

public class thread2 implements Runnable{
    @Override
    public synchronized void run() {
        for (int j = 0; j < 10; j++) {
            System.out.println("thread2: "+ (i = i - 1));
        }

    }
}
