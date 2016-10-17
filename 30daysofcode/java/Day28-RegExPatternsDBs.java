import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        ArrayList<String> list = new ArrayList<String>();
        String myRegExString = "[a-z]+[@][g][m][a][i][l][.][c][o][m]";
        // Create a Pattern object (compiled RegEx) and save it as 'p'
        Pattern p = Pattern.compile(myRegExString);

        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            Matcher m = p.matcher(emailID);

            if( m.find() ) {
                //System.out.println( m.group() );
                // Add match to list
                list.add(firstName);
            }         
        }
        
        Collections.sort(list);

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
