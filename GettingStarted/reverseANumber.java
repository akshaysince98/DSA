package DSA.PEPCODING.GettingStarted;

import java.util.Scanner;

public class reverseANumber {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = n; i > 0; i = i / 10) {
            System.out.println(i % 10);

        }
        scn.close();

    }
}