package DSA.PEPCODING.IntroToRecursion;

import java.util.Scanner;

public class powerLogarithmic {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = power(x, n);
        System.out.println(ans);
        scn.close();

    }

    public static int power(int x, int n) {

        if(n ==1){
            return x;
        }
        int xpnb2 = power(x, n/2);
        int xpn = xpnb2*xpnb2;
        if(n%2!=0){
            xpn*=x;
        }
        return xpn;
    }

}