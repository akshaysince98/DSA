package DSA.PEPCODING.Patterns;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n / 2;
        int nst = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print("\t");
            }
            for(int j = 0; j < nst; j++){
                System.out.print("*\t");
            }
            if(i < n/2){
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst-=2;
            }

            System.out.println();
        }
        scn.close();
    }

}
