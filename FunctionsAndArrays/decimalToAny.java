package DSA.PEPCODING.FunctionsAndArrays;

import java.util.Scanner;

public class decimalToAny {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
        scn.close();
    }

    public static int getValueInBase(int n, int b) {
        // write code here
        int p = 1;
        int dn = 0;
        for(int i =n; i>0; i=i/b){
            dn += i%b*p;
            p*=10;
        }

        return dn;
    }
}