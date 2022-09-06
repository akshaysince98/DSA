package DSA.PEPCODING.GettingStarted;

import java.util.Scanner;

public class gcdLcm {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int tn1 = num1;
        int tn2 = num2;
        while (tn1 % tn2 != 0) {
            int r = tn1 % tn2;
            tn1 = tn2;
            tn2 = r;
        }
        System.out.println(tn2);
        System.out.println(num1 * num2 / tn2);
        scn.close();
    }

}
