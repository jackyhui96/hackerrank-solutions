import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        convertStringToInteger(S);
    }
    
    public static void convertStringToInteger(String s) {
        try {
            int n = Integer.parseInt(s);
            System.out.println(n);
        }
        catch(Exception e) {
            System.out.println("Bad String");
        }
    }
}