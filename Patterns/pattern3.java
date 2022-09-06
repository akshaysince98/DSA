package DSA.PEPCODING.Patterns;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*\t");

            }
            System.out.println();
        }
        scn.close();
    }

}
