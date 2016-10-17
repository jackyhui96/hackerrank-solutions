import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int max = 0;

            int i = 0;
            while(i < n) {
                int j = i+1;
                while(j <= n) {
                    int num = i & j;
                    if(num > max && num < k){
                        max = num;
                    }
                    j++;
                }
                i++;
            }

            System.out.println(max);
        }
    }
}
