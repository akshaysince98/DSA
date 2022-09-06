package DSA.PEPCODING.IntroToRecursion;

import java.util.Scanner;

public class printDecreasing {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDec(n);
        scn.close();

    }

    public static void printDec(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDec(n - 1);
    }

}