package bai1;

public class Bai1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberGenerator());
        Thread thread2 = new Thread(new NumberGenerator());
        thread2.setPriority(thread2.MAX_PRIORITY);
        thread1.setPriority(thread1.MIN_PRIORITY);
        thread1.start();
        thread2.start();

    }
}