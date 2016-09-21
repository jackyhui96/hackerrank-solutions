import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(factorial(num));
    }

    private static int factorial(int x) {
        if(x == 0 || x == 1) {
            return 1;
        }
        else {
            return (x * factorial(x-1));
        }
    }
}