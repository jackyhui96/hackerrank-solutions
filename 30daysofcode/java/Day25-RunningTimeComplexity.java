import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i < n; i++) {
            isPrime(in.nextInt());
        }
    }

    public static void isPrime(int n) {
        boolean flag = false;

        if(n == 1) {
            flag = true;
        }
        else {
            for(int i = 2; (double)i < Math.sqrt(n); i++) {
                if(n % i == 0) {
                    flag = true;
                    break;
                }
            }
        }

        if(flag) {
            System.out.println("Not prime");
        }
        else {
            System.out.println("Prime");
        }   
    }
}
