package DSA.PEPCODING.TwoDArrays;

import java.util.Scanner;

public class spiralDisplay {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int minc = 0;
        int maxc = arr[0].length - 1;
        int minr = 0;
        int maxr = arr.length - 1;
        int count = 0;
        while (count < n * m) {
            for (int i = minr; i <= maxr && count < n * m; i++) {
                System.out.println(arr[i][minc]);
                count++;
            }
            minc++;
            for (int j = minc; j <= maxc && count < n * m; j++) {
                System.out.println(arr[maxr][j]);
                count++;
            }
            maxr--;
            for (int i = maxr; i >= minr && count < n * m; i--) {
                System.out.println(arr[i][maxc]);
                count++;
            }
            maxc--;
            for (int j = maxc; j >= minc && count < n * m; j--) {
                System.out.println(arr[minr][j]);
                count++;
            }
            minr++;
        }
        scn.close();
    }

}
