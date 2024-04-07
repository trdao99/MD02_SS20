package bai2;

public class TestThread {
    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddThread());
        Thread evenThread = new Thread(new EvenThread());
        oddThread.start();
        evenThread.start();
    }
}
