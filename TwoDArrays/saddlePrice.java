package DSA.PEPCODING.TwoDArrays;

import java.util.Scanner;

public class saddlePrice {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        scn.close();
        int r = 0;
        int c = 0;
        while (true) {
            int ans = arr[r][c];
            boolean flag = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[r][i] < ans) {
                    c = i;
                    ans = arr[r][c];
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][c] > ans) {
                    flag = false;
                    break;
                }
            }
            r++;
            if (flag == true) {
                System.out.print(ans);
                break;
            }
            if(r>=arr.length){
                System.out.println("Invalid input");
            }

        }
    }

}
