import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int numSwaps;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        bubbleSort(n, a);
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }

    public static void bubbleSort(int n, int[] array) {
        for(int i = 0; i < n; i++) {
            int numberOfSwaps = 0;

            for(int j = 0; j < n-1; j++) {
                if(array[j] > array[j+1]) {
                    swap(array, j, j+1);
                    numberOfSwaps++;
                    numSwaps++;
                }
            }

            if(numberOfSwaps == 0) {
                break;
            }
        }
        
    }

    public static void swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
