package DSA.PEPCODING.GettingStarted;

import java.util.Scanner;

public class digitsOfNumber {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = 1;

        for (int i = n; i > 10; i = i / 10) {

            d = d * 10;

        }

        for (int i = d; i > 0; i = i / 10) {
            int n1 = n / i;
            n = n % i;
            System.out.println(n1);
        }
        scn.close();

    }
}