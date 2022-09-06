package DSA.PEPCODING.Patterns;

import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int v = 1;
        for(int i = 1; i <=n; i ++){
            for(int j = 0; j < i; j++){
                System.out.print(v+"\t");
                v++;
            }
            System.out.println();
        }
        scn.close();
    }
    
}
