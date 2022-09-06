package DSA.PEPCODING.StringsAndArrayList;

import java.util.Scanner;

public class palindromicSubstr {

    public static void solution(String str) {
        // write your code here
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                boolean flag = isPalindrome(sub);
                if(flag == true){
                    System.out.println(sub);
                }
            }
        }

    }
    public static boolean isPalindrome(String sub){
        boolean flag = true;
        int left = 0;
        int right = sub.length()-1;
        while(left<right){
            if(sub.charAt(left)!=sub.charAt(right)){
                flag = false;
                break;
            }
            left++;
            right--;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
        scn.close();
    }

}