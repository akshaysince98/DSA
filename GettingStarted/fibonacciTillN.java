package DSA.PEPCODING.GettingStarted;

import java.util.Scanner;

public class fibonacciTillN {

    public static void main(String[] args) {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0;
        int b = 0;
        int c = 1;

        for (int i = 0; i < n; i++) {

            a = b;
            b = c;
            c = a + b;
            System.out.println(a);
        }
        scn.close();

    }

}