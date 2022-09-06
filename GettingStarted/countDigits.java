package DSA.PEPCODING.GettingStarted;

import java.util.Scanner;

public class countDigits {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = 0;

        for (int i = n; i > 0; i = i / 10) {
            d++;

        }
        System.out.println(d);
        scn.close();
    }

}