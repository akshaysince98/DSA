package DSA.PEPCODING.RecursionInArrays;

import java.util.Scanner;

public class firstIndex {
    public static void main(String[] args) {

        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();
        System.out.println (fI(arr, 0, x));
        scn.close();
    }

    public static int fI(int[] arr, int idx, int x) {
        if(idx == arr.length){
            return -1;
        }

        if(arr[idx] == x ){
            return idx;
        } else {
            return fI(arr, idx+1, x);
        }
    }

}