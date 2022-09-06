package DSA.PEPCODING.IntroToRecursion;

import java.util.Scanner;

public class printIncreasing {
    public static void main(String[] args) {

        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printInc(n);
        scn.close();
    }

    public static void printInc(int n) {

        if (n == 0) {
            return;
        }
        printInc(n - 1);
        System.out.println(n);

    }

}