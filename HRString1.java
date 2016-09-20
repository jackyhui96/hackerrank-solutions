import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        // Print the sum of both Strings
        int NumA = A.length();
        int NumB = B.length();
        System.out.println(NumA+NumB);
        
        // Print Yes if A bigger than B else No
        int flag = A.compareTo(B);
        if(flag > 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        
        // Print both strings with first character capitalised.
        String charA = String.valueOf(A.charAt(0));
        A = charA.toUpperCase() + A.substring(1);
        String charB = String.valueOf(B.charAt(0));
        B = charB.toUpperCase() + B.substring(1);
        
        System.out.println(A + " " + B);
    }
}
