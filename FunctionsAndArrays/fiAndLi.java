package DSA.PEPCODING.FunctionsAndArrays;

import java.util.Scanner;

public class fiAndLi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int left = 0;
        int right = a.length - 1;
        int fi = -1;
        int li = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (d < a[mid]) {
                right = mid - 1;
            } else if(d>a[mid]){
                left = mid + 1;
            }else{
                fi = mid;
                right = mid-1;
            }
        }
        left = 0;
        right = a.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (d < a[mid]) {
                right = mid - 1;
            } else if(d>a[mid]){
                left = mid + 1;
            }else{
                li = mid;
                left = mid+1;
            }
        }
        
        System.out.println(fi);
        System.out.println(li);
        scn.close();

    }
}
