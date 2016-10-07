/* Calculate the hourglass sum for every hourglass in Array A
   then print the maximum hourglass sum.
   Hourglass:
   1 1 1
     1
   1 1 1
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 6;
        int arr[][] = new int[n][n];

        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(findMaximumHourGlass(arr, n));
    }

    public static int findMaximumHourGlass(int[][] array, int n) {
        int highest = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < n-2; i++) {
            for(int j = 0; j < n-2; j++) {
                sum = calculateSumHourglass(array, i, j);
                if(sum > highest) {
                    highest = sum;
                }
            }
        }
        
        return highest;
    }

    public static int calculateSumHourglass(int[][] array, int x, int y) {
        return array[x][y] + array[x+2][y] + array[x][y+1] + array[x+1][y+1] + array[x+2][y+1] + array[x][y+2] + array[x+2][y+2];
    }
}
