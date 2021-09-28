// solution is in class Solution


//Initial Template for Java

import java.io.*;

class fighting_the_darkness{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(a1[i]);
            }
            Solve ob = new  Solve();
            System.out.println(ob.maxDays(arr,n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solve{
    long maxDays(long arr[], int n){
        // code here 
        long max = arr[0];
        for(int i=1; i<n; i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
}