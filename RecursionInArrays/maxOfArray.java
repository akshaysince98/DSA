package DSA.PEPCODING.RecursionInArrays;

import java.util.Scanner;

public class maxOfArray {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = moA(arr, 0);
        System.out.println(ans);
        scn.close();
    }

    public static int moA(int[] arr, int idx) {

        if (idx == arr.length - 1) {
            return arr[idx];
        }

        int misa = moA(arr, idx + 1);

        if (arr[idx] > misa) {
            return arr[idx];
        } else {
            return misa;
        }

    }

}