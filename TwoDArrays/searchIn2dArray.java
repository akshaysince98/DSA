package DSA.PEPCODING.TwoDArrays;

import java.util.Scanner;

public class searchIn2dArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        int x = scn.nextInt();
        scn.close();

        int i = 0;
        int j = arr.length-1;

        while(i<=arr.length-1 && j>=0){
            if(arr[i][j]<x){
                i++;
            }else if(arr[i][j]>x){
                j--;
            }else{
                System.out.println(i);
                System.out.println(j);
                return;
            }
        }

        System.out.println("Not Found");
    }

}
