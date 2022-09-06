package DSA.PEPCODING.StringsAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class removePrimes {

    public static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void solution(ArrayList<Integer> al) {
        // write your code here
        for (int i = 0; i < al.size(); i++) {
            boolean isprime = isPrime(al.get(i));
            if (isprime == true) {
                al.remove(i);
                i--;
            }

        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
        scn.close();
    }

}