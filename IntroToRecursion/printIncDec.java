package DSA.PEPCODING.IntroToRecursion;

import java.util.Scanner;

public class printIncDec {
    public static void main(String[] args) {

        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
        scn.close();
    }

    public static void pdi(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        pdi(n - 1);
        System.out.println(n);

    }

}