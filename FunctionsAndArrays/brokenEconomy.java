package DSA.PEPCODING.FunctionsAndArrays;

import java.util.Scanner;

public class brokenEconomy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        int d = scn.nextInt();
        boolean flag = false;
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a[mid] == d) {
                System.out.println(a[mid]);
                flag = true;
                break;
            } else if (a[mid] < d) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (flag == false) {
            System.out.println(a[right - 1]);
            System.out.println(a[right]);
        }
        scn.close();
    }

}
