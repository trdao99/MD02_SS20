package bai4;



public class test extends Thread{
    public void run() {
        synchronized (test.class) {
            for (int i = 0; i < 10; i++) {
                System.out.println("test: " + (int)((Math.random()+1)*100));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
