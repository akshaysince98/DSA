package DSA.PEPCODING.FunctionsAndArrays;

import java.util.Scanner;

public class findInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        int d= scn.nextInt();
        int id = -1;
        for(int i = 0; i <n; i++){
            if(a[i] == d){
                id = i;
            }
        }
        System.out.println(id);
        scn.close();
    }

}
