package DSA.PEPCODING.FunctionsAndArrays;

import java.util.Scanner;

public class anyToAny {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int ans = anyBaseToAnyBase(n, sourceBase, destBase);
        System.out.println(ans);
        scn.close();
    }
    public static int anyBaseToAnyBase(int n, int b1, int b2){
        int dec = getValueIndecimal(n, b1);
        int ans = getValueInBase (dec, b2);
        return ans;
        
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