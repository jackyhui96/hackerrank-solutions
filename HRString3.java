import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        /* Enter your code here. Print output to STDOUT. */
        int size = A.length();
        String newStr = String.valueOf(A.charAt(size-1));
        for(int i = size-2; i >= 0 ; i--) {
            newStr = newStr + String.valueOf(A.charAt(i));
        }
        
        if(A.compareTo(newStr) == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}