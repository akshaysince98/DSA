package DSA.PEPCODING.IntroToRecursion;

import java.util.Scanner;

public class powerLinear {
    public static void main(String[] args) {

        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();

        int ans = power(x, n);
        System.out.println(ans);
        scn.close();
    }

    public static int power(int x, int n) {

        if (n == 0) {
            return 1;
        }
        int pnm1 = power(x, n - 1);
        int pn = pnm1 * x;

        return pn;
    }

}