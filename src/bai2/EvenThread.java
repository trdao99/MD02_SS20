package bai2;

public class EvenThread extends Thread {
    @Override
    public void run() {
        synchronized (EvenThread.class) {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.println("EvenThread: "+i);
                    try {
                        Thread.sleep(150);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
    }
}

