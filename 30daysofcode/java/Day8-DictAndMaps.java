import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name, new Integer(phone));
        }

        while(in.hasNext()) {
            String s = in.next();
            //Write code here
            int value;
            if(map.containsKey(s)) {
                value= map.get(s);
                System.out.println(s + "=" + value);
            }
            else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}