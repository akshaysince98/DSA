package DSA.PEPCODING.StringsAndArrayList;

import java.util.Scanner;

public class stringDiffCharacters {

    public static String solution(String str) {
        // write your code here
        StringBuilder sb = new StringBuilder(str);
        StringBuilder A = new StringBuilder();
        A.append(sb.charAt(0));
        for (int i = 0; i < sb.length() - 1; i++) {
            int ch = (sb.charAt(i + 1) - sb.charAt(i));
            A.append(ch);
            A.append(sb.charAt(i+1));
        }

        return A.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
        scn.close();
    }

}