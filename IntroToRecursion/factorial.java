package DSA.PEPCODING.IntroToRecursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = fact(n);
        System.out.println(ans);
        scn.close();
    }

    public static int fact(int n) {

        if (n == 0) {
            return 1;
        }
        int nm1 = fact(n - 1);
        int nf = n * nm1;

        return nf;
    }

}