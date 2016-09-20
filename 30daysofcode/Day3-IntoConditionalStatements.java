import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String answer;

        if((n % 2 == 1) || (n >= 6 && n <= 20)) {
            answer = "Weird";
        }
        else {
            answer = "Not Weird";
        }
        System.out.println(answer);
    }
}