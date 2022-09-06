package DSA.PEPCODING.RecursionInArrays;

import java.util.Scanner;

public class lastIndex {
    public static void main(String[] args) {

        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();
        System.out.println(li(arr, arr.length-1, x));
        scn.close();
    }

    public static int li(int[] arr, int idx, int x) {
        if(idx == -1){
            return -1;
        }

        if(arr[idx] == x ){
            return idx;
        } else {
            return li(arr, idx-1, x);
        }
    }

}