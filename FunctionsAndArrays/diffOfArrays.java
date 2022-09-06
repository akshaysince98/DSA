package DSA.PEPCODING.FunctionsAndArrays;

import java.util.Scanner;

public class diffOfArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();

        int[] one = new int[n1];
        for (int i = 0; i < n1; i++) {
            one[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();

        int[] two = new int[n2];
        for (int i = 0; i < n2; i++) {
            two[i] = scn.nextInt();
        }

        int[] diff = new int[n2];
        int k = diff.length - 1;
        int o = one.length - 1;
        int t = two.length - 1;
        int c = 0;
        while (k >= 0) {
            int d = two[t] - c;
            if (o >= 0) {
                d = d - one[o];
            }

            if (d < 0) {
                d = d + 10;
                c = 1;
            } else {
                c = 0;
            }
            diff[k] = d;
            k--;
            o--;
            t--;
        }

        int idx = 0;
        while(idx < diff.length){
            if(diff[idx]!=0){
                break;
            }else{
                idx++;
            }
        }

        for(int i = idx; i<diff.length; i++){
            System.out.println(diff[i]);
        }
        scn.close();

    }

}
