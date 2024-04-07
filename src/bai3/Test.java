package bai3;

import bai2.EvenThread;
import bai2.OddThread;

public class Test {
    public static void main(String[] args) {
        Thread LazyPrimeFactorization = new Thread(new LazyPrimeFactorization());
        Thread OptimizedPrimeFactorization = new Thread(new OptimizedPrimeFactorization());
        LazyPrimeFactorization.start();
        OptimizedPrimeFactorization.start();
    }
}
