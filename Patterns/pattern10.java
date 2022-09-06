package DSA.PEPCODING.Patterns;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int osp = n / 2;
        int isp = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < osp; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j = 0; j < isp; j++) {
                System.out.print("\t");
            }
            if(i>0 && i<n-1){
                System.out.print("*");
            }
            if(i<n/2){
                osp--;
                isp+=2;
            }else{
                osp++;
                isp-=2;
            }
            System.out.println();
            scn.close();
        }
    }

}
