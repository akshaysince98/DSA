package DSA.PEPCODING.FunctionsAndArrays;

import java.util.Scanner;

public class spanOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] A = new int[n];
        for(int i = 0; i <n; i++){
            A[i] = scn.nextInt();
        }

        int max = A[0];
        int min = A[0];
        for(int i = 0; i < n; i++){
            if(A[i]>max){
                max = A[i];
            }
            if (A[i]<min){
                min = A[i];
            }
        }

        System.out.println(max-min);
        scn.close();

    }
    
}
