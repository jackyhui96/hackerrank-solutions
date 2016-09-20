import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String input;
        int numLines;
        String evens;
        String odds;
        numLines = in.nextInt();
        in.nextLine();
        
        for(int i = 0; i < numLines; i++) {
            evens = "";
            odds = "";
            input = in.nextLine();
            for(int j = 0; j < input.length(); j++) {
                if(j % 2 == 0) {
                    evens += Character.toString(input.charAt(j));
                }
                else {
                    odds += Character.toString(input.charAt(j));
                }
            }
            System.out.println(evens + " " + odds);
        }

    }
}