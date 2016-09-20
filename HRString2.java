import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        int inputNum = in.nextInt();
                
        // add all substrings to an array
        ArrayList<String> strings = new ArrayList<String>();
        for(int i = 0; i < (inputStr.length() - inputNum + 1); i++) {
            String subStr = inputStr.substring(i, (i + inputNum));
            strings.add(subStr);
        }
        
        // find min and max substrings in lexicographical order
        String min = strings.get(0);
        String max = strings.get(0);
        for(int i = 1; i < strings.size(); i++) {
            String temp = strings.get(i);
            
            if(temp.compareTo(max) > 0) {
                max = temp;
            }
            
            if(temp.compareTo(min) < 0) {
                min = temp;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}