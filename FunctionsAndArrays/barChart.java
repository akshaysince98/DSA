package DSA.PEPCODING.FunctionsAndArrays;

import java.util.Scanner;

public class barChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i <n; i++){
            a[i] = scn.nextInt();
        }

        int max = a[0];
        for(int i = 0; i < a.length; i++){
            if (a[i]>max){
                max = a[i];
            }
        }

        for(int i = max; i>0; i--){
            for(int j = 0; j<a.length; j++){
                if(a[j]>=i){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        scn.close();
    }
    
}
