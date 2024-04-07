package bai3;

import static java.lang.Thread.sleep;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        int i = 2;
        int a = 2;
        while (true) {
            boolean check = true;
            int j;
            for ( j = a; j < i; a++) {
                if (i%j == 0) {
                    check = false;
                }
            }
            if(check){
                System.out.println("LazyPrimeFactorization: " + i);
                try {
                    sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            i++;
        }
    }
}
