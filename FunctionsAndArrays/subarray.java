package DSA.PEPCODING.FunctionsAndArrays;

import java.util.Scanner;

public class subarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        int fi = 0;
        int li = 0;
        while(fi<a.length){
            li =fi;
            while(li<a.length){
                int id = fi;
                while(id<=li){
                    System.out.print(a[id]+"\t");
                    id++;
                }
                System.out.println();
                li++;
            }
            
            fi++;
        }
        scn.close();
    }

}
