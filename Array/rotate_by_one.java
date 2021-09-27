// Solution is from line no 46


//Initial Template for Java


import java.io.*;

class rotate_by_one {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            solve obj = new solve();
            obj.rotate(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class solve {
    
    public void rotate(int arr[], int n)
    {
        int temp =arr[n-1];
        for(int i=n-1; i>0; i--)
            arr[i]=arr[i-1];
        arr[0]=temp;
    }
}