// solution is in class solution from line no 31


// Initial Template for Java

import java.io.*;

class missing_no {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            solution sln = new solution();
            System.out.println(sln.MissingNumber(array, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class solution {
    int MissingNumber(int array[], int n) {
        int arr[]=new int[n+1];
        for(int i=0; i<n-1; i++)
            arr[array[i]]=1;
        
        for(int i=1; i<=n; i++)
            if(arr[i]==0) 
                return i;
        return -1;
    }
}