package DSA.PEPCODING.FunctionsAndArrays;

import java.util.Scanner;

public class digitFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
        scn.close();
    }
    public static int getDigitFrequency(int n, int d){
        int f = 0;
        for(int i = n; i>0;i= i/10){
            if(i%10 == d){
                f++;
            }
        }
        return f;

    }

}
