package bai5;

import bai1.NumberGenerator;

public class bai5 {
    public static int i =0;
    public static void main(String[] args) {
        Thread thread1 = new Thread(new thread1());
        Thread thread2 = new Thread(new thread2());
        thread1.start();
        thread2.start();
    }
}
