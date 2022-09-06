package DSA.PEPCODING.StringsAndArrayList;

import java.util.Scanner;

public class toggleCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(toggle(str));
        scn.close();
    }

    public static String toggle(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                char lc = (char) (ch - ('A' - 'a'));
                sb.setCharAt(i, lc);
            } else {
                char uc = (char) (ch + ('A' - 'a'));
                sb.setCharAt(i, uc);
            }

        }

        return sb.toString();
    }

}
