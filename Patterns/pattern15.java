package DSA.PEPCODING.Patterns;

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sv = 1;
        int sp = n / 2;
        int st = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <=st; j++) {
                System.out.print(sv + "\t");
                if (j <=st / 2) {
                    sv++;
                } else if(j==st){
                    continue;
                }
                else {
                    sv--;
                }
            }
            if (i < n / 2) {
                sv++;
                sp--;
                st+=2;
            }else{
                sv--;
                sp++;
                st-=2;
            }
            System.out.println();
        }
        scn.close();
    }

}
