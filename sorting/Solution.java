    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

        static String[] bigSorting(String[] arr) {
            // Complete this function
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            String[] arr = new String[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.next();
            }
            String[] result = bigSorting(arr);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
            }
            System.out.println("");


            in.close();
        }
    }