import java.io.*;
import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        a = sortString(a);
        b = sortString(b);
        if(a.compareTo(b) == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    static String sortString(String a) {
        a = a.toLowerCase();
        char[] array = a.toCharArray();
        Arrays.sort(array);
        String sorted = new String(array);
        return sorted; 
    }
  
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
