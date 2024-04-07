package bai1;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        synchronized (NumberGenerator.class) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("end");
    }
}