package DSA.PEPCODING.TwoDArrays;

import java.util.Scanner;

public class exitPoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m= scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int i = 0;
        int j = 0;
        int dir = 0;
        while(true){
            dir = (dir + arr[i][j])%4;

            //east
            if(dir == 0){
                j++;
                if(j == arr[0].length){
                    j--;
                    break;
                }
            }
            //south
            if(dir == 1){
                i++;
                if(i == arr.length){
                    i--;
                    break;
                }
            }
            //west
            if(dir == 2){
                j--;
                if(j == -1){
                    j++;
                    break;
                }
            }
            //north
            if(dir == 3){
                i--;
                if(i == -1){
                    i++;
                    break;
                }
            }
        }
        System.out.println(i);
        System.out.println(j);
        scn.close();
    }
    
}
