import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] dateReturned = input.split("\\s+");
        input = in.nextLine();
        String[] returnDate = input.split("\\s+");
        int fine;

        int year1 = Integer.parseInt(dateReturned[2]);
        int year2 = Integer.parseInt(returnDate[2]);
        int month1 = Integer.parseInt(dateReturned[1]);
        int month2 = Integer.parseInt(returnDate[1]);
        int day1 = Integer.parseInt(dateReturned[0]);
        int day2 = Integer.parseInt(returnDate[0]);

        if(year1 > year2) {
            fine = 10000;
        }
        else {
            if(month1 > month2 && (year1 == year2)) {
                fine = 500 * (month1 - month2);
            }
            else {
                if(day1 > day2 && (month1 == month2)) {
                    fine = 15 * (day1 - day2);
                }
                else {
                    fine = 0;
                }
            }
        }
        System.out.println(fine);
    }
}