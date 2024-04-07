package bai2;

public class OddThread extends Thread{
    public void run() {
        synchronized (OddThread.class) {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("OddThread: "+i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
}
