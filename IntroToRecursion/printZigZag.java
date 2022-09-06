package DSA.PEPCODING.IntroToRecursion;

import java.util.Scanner;

public class printZigZag {
    public static void main(String[] args) {

        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pzz(n);
        scn.close();
    }

    public static void pzz(int n) {

        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        pzz(n-1);
        System.out.print(n + " ");
        pzz(n-1);
        System.out.print(n + " ");
        
    }

}