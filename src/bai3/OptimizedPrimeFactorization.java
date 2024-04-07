package bai3;

import static java.lang.Thread.sleep;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        int i = 2;

        while (true) {
            boolean check = true;
            int j;
            for ( j = 2; j <= Math.sqrt(i); j++) {
                if (i%j == 0) {
                    check = false;
                }
            }
            if(check){
                System.out.println("OptimizedPrimeFactorization: " + i);
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
