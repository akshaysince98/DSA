package DSA.PEPCODING.RecursionInArrays;

import java.util.Scanner;

public class displayArrayRev {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        dar(arr, 0);
        scn.close();
    }

    public static void dar(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }

        dar(arr, idx + 1);
        System.out.println(arr[idx]);
    }
}