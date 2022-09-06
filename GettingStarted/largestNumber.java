package DSA.PEPCODING.GettingStarted;

import java.util.Scanner;

public class largestNumber {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scn.nextInt();
            int[] A = new int[N];
            for (int j = 0; j < A.length; j++) {
                A[j] = scn.nextInt();
            }
            
            int max = 0;
            int idx = 0;
            for(int j = A.length-1; j>=0; j--){
                if(A[j]>max){
                    max= A[j];
                    idx = j;
                }
                if(max==9){
                    break;
                }
            }

            for(int j = 0; j<A.length; j++){
                if(A[j]<max){
                    A[idx]= A[j];
                    A[j] = max;
                    break;
                }
            }

            
            for (int j = 0; j < A.length; j++) {
                System.out.print(A[j] + " ");
            }
            System.out.println();

        }
        scn.close();

    }

}
