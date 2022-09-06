package DSA.PEPCODING.FunctionsAndArrays;

import java.util.Scanner;

public class anyBaseMultiply {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
        scn.close();
    }

    public static int getProduct(int b, int n1, int n2) {
        // write your code here
        int ans = 0;
        int p = 1;
        while (n2 > 0) {
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int psd = singleDigitProduct(b, n1, d2);
            ans = getSum(b, ans, psd * p);
            p = p * 10;

        }

        return ans;
    }

    public static int singleDigitProduct(int b, int n1, int d2) {
        int c = 0;
        int sp = 0;
        int p = 1;
        while (n1 > 0 || c > 0) {
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d = d1 * d2 + c;
            c = d / b;
            d = d % b;
            sp = sp + d * p;
            p = p * 10;

        }

        return sp;

    }

    public static int getSum(int b, int n1, int n2) {
        // write ur code here
        int sum = 0;
        int c = 0;
        int tp = 1;

        while (c > 0 || n1 > 0 || n2 > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int d = d1 + d2 + c;
            c = d / b;
            d = d % b;
            sum = sum + d * tp;
            tp = tp * 10;
        }
        return sum;
    }

}