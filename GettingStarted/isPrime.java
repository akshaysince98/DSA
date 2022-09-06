package DSA.PEPCODING.GettingStarted;

import java.util.Scanner;

public class isPrime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();

            boolean isPrime = true;

            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    isPrime = false;
                    System.out.println(j);
                    break;
                }
            }

            if (isPrime == false) {
                System.out.println("not prime");
            } else {
                System.out.println("prime");
            }

        }
        scn.close();

    }
}