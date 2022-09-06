package DSA.PEPCODING.GettingStarted;

import java.util.Scanner;

public class rotateANumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int d = 0;
        for (int i = n; i > 0; i = i / 10) {
            d++;
        }

        k = k % d;

        if (k < 0) {
            k = d + k;
        }
        int div = 1;
        int mult = 1;
        for (int i = 1; i <= d; i++) {
            if (i <= k) {
                div = div * 10;

            } else {
                mult = mult * 10;
            }
        }

        int r = (n % div) * mult + n / div;
        System.out.println(r);
        scn.close();
    }
}
