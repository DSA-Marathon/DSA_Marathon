// Solution is in class Solution

//Initial Template for Java

import java.io.*;
import java.util.*;

public class count_pairs_with_given_sum {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int ans = new GFG().getPairsCount(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class GFG {
    int getPairsCount(int[] arr, int n, int sum) {
        HashMap<Integer, Integer> hm = new HashMap<>();
 
        // Store counts of all elements in map hm
        for (int i = 0; i < n; i++) {
 
            // initializing value to 0, if key not found
            if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);
 
            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int twice_count = 0;
 
        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i = 0; i < n; i++) {
            if (hm.get(sum - arr[i]) != null)
                twice_count += hm.get(sum - arr[i]);
 
            // if (arr[i], arr[i]) pair satisfies the
            // condition, then we need to ensure that the
            // count is decreased by one such that the
            // (arr[i], arr[i]) pair is not considered
            if (sum - arr[i] == arr[i])
                twice_count--;
        }
 
        // return the half of twice_count
        return twice_count / 2;
    }
}
