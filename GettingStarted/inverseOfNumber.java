package DSA.PEPCODING.GettingStarted;

import java.util.Scanner;

public class inverseOfNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 0;
        int place = 1;
        for (int j = n; j > 0; j = j / 10) {
            int r = j % 10;
            i = i + place * (int) Math.pow(10, r - 1);
            place++;
        }
        System.out.println(i);
        scn.close();
    }
}
