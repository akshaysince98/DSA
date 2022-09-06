package DSA.PEPCODING.TwoDArrays;

import java.util.Scanner;

public class wakanda2 {
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

        int sp = 0;

        while (sp < arr[0].length) {
            int x = 0;
            int y = sp;
            while (y < arr[0].length) {
                System.out.println(arr[x][y]);
                x++;
                y++;
            }
            sp++;
        }
    }

}
