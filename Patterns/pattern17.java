package DSA.PEPCODING.Patterns;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = n / 2 + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < st; j++) {

                if (j < n / 2 && i < n / 2) {
                    System.out.print("\t");
                } else if (j < n / 2 && i > n / 2) {
                    System.out.print("\t");

                } else {

                    System.out.print("*\t");
                }

            }
            if (i < n / 2) {
                st++;
            } else {
                st--;
            }
            System.out.println();
        }
        scn.close();
    }

}
