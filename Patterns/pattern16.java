package DSA.PEPCODING.Patterns;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = 2 * n - 1;
        for (int i = 1; i <= n; i++) {
            int val = 1;
            for (int j = 1; j <= m; j++) {

                if (j > i && j <=m - i) {
                    System.out.print("\t");
                } else {
                    System.out.print(val + "\t");

                }

                if (j <=m / 2) {
                    val++;
                } else if (j == m){
                    continue;
                }
                 else {
                    val--;
                }
            }
            System.out.println();
        }
        scn.close();
    }

}
