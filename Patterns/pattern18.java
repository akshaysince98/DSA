package DSA.PEPCODING.Patterns;

import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = 0;
        int nst = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < nst; j++) {
                if (i > 0 && i < n / 2) {
                    if (j == 0 || j == nst-1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");

                    }
                } else {
                    System.out.print("*\t");

                }
            }
            System.out.println();
            if(i<n/2){
                nsp++;
                nst-=2;
            }else{
                nsp--;
                nst+=2;
            }

        }
        scn.close();
    }

}
