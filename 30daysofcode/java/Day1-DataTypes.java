import java.util.Scanner;

public class Solution {

    private static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double and String variables. */
        int j = 0;
        double e = 0.0;
        String t = ""; 
        /* Read and save an integer, doiuble, and String to your variable. */
        j = scan.nextInt();
        e = scan.nextDouble();
        scan.nextLine();
        t = scan.nextLine();
        System.out.println(t);
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+j);
        /* Print the sum of the doubke variables on a new line. */
        System.out.println(d+e);
        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first */
        System.out.print(s);
        System.out.print(t);

        scan.close();
    }
}