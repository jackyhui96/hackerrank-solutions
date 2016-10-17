import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // List that contains the number of students for each case
    static ArrayList<Integer> numList = new ArrayList<Integer>();

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        int numTestCases = 5;
        System.out.println(numTestCases);
        
        testCase("YES");
        testCase("NO");
        testCase("YES");
        testCase("NO");
        testCase("YES");
    }

    // Print input data for a test case that will result in a lecture cancellation
    public static void testCase(String s) {

        // Random number generator
        Random rn = new Random();
        // Generate a unique random number for the number of students
        int n = rn.nextInt(20 - 3 + 1) + 3;
        while(numList.contains(n)) {
            n = rn.nextInt(20 - 3 + 1) + 3;
        }
        numList.add(n);

        // Generate a random cancellation threshold for cancelling a lecture
        int k = rn.nextInt((n-2) - 1 + 1) + 1;
        int[] array = new int[n];

        System.out.print(n);
        System.out.print(" " + k);
        System.out.println("");

        // Array must have at least one positive, one negative, and 0
        array[0] = 0;
        array[1] = rn.nextInt(10 - 1 + 1) + 1;
        array[2] = rn.nextInt((-1) - (-10) + 1) + (-10);

        System.out.print(array[0]);
        System.out.print(" " + array[1]);
        System.out.print(" " + array[2]);

        // Change values of max and min for random njumber genertor for late times of array
        int x = 0;
        int y = 0;
        if(s.equals("YES")) {
            x = (-1);
            y = (-10);
        }
        else {
            x = 10;
            y = 1;
        }
        // Generate enough numbers to get the desired output
        for(int j = 3; j < k+2; j++) {
            int num = rn.nextInt(x - y + 1) + y;
            array[j] = num;
            System.out.print(" " + array[j]);
        }
        // Fill the rest with any number
        for(int j = k+2; j < n; j++) {
            int num = rn.nextInt(10 - (-10) + 1) + (-10);
            array[j] = num;
            System.out.print(" " + array[j]);
        }
        System.out.println("");
    }
}
