package bai4;

import bai2.EvenThread;
import bai2.OddThread;

public class bai4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new test());
        thread1.start();

    }
}
