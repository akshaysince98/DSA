package DSA.PEPCODING.GettingStarted;

import java.util.Scanner;

public class bulbs {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }
        scn.close();
    }

}
