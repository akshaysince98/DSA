package DSA.PEPCODING.Patterns;

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 0;
        int c = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                a = b;
                b = c;
                c = a + b;
                System.out.print(a+"\t");
            }
            System.out.println();
        }
        scn.close();
    }

}
