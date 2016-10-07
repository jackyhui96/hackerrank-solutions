// Given a base-10 integer n, convert it to binary.
// Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String binary = convertDenaryToBinary(n);
        int count = 0;
        int highest = 0;

        for(int i = 0; i < binary.length(); i++) {
            
            if(binary.charAt(i) == '1') {
                count++;
            }
            else {
                if(count > highest) {
                    highest = count;
                }
                count = 0;
            }
            if(count > highest) {
                highest = count;
            }
        }
        System.out.println(highest);
    }

    // Convert any decimal to String representation
    // Alternatively I would like to solve without using the Integer function
    private static String convertDenaryToBinary(int x) {
        return Integer.toBinaryString(x);
    }
}