package DSA.PEPCODING.StringsAndArrayList;

import java.util.Scanner;

public class permutationsIterative {

    public static int fact(int n) {

        if (n == 0) {
            return 1;
        }
        int nm1 = fact(n - 1);
        int nf = n * nm1;

        return nf;
    }

    public static void solution(String str) {
        // write your code here

        int factorial = fact(str.length());

        for (int i = 0; i < factorial; i++) {
            StringBuilder sb = new StringBuilder(str);
            int div = i;
            while (sb.length() > 0) {
                int idx = div % sb.length();
                div = div / sb.length();
                System.out.print(sb.charAt(idx));
                sb.delete(idx, idx + 1);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
        scn.close();
    }

}