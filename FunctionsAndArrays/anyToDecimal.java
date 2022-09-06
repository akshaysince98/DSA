package DSA.PEPCODING.FunctionsAndArrays;

import java.util.Scanner;

public class anyToDecimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();

        int d = getValueIndecimal(n, b);
        System.out.println(d);
        scn.close();
    }

    public static int getValueIndecimal(int n, int b) {
        // write your code here
        int dn =0;
        int p = 1; //base to power 0
        while(n>0){
            dn += n%10*p;
            n /=10;
            p *= b;
        }
        return dn;
    }
}