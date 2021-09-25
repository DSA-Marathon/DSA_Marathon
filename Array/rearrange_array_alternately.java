// solution is in class solution


import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args)throws IOException
	{

// 		Scanner in = new Scanner(System.in);
        
// 		int t = in.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
         //testcases
        int t = Integer.parseInt(read.readLine());
		
		while(t-- >0)
		{
		    //size of array
		    int n = Integer.parseInt(read.readLine());
		    int[] temp= new int[n];
		    
		    String str[] = read.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0;i<n;i++)
		        temp[i] = Integer.parseInt(str[i]);
		    
		    // StringBuffer sb = new StringBuffer();
		    
		    Solution ob = new Solution();
		    
		    //calling rearrange() function
		    ob.rearrange(temp, n);
		    StringBuffer sb = new StringBuffer();
		    
		    //appending and printing the elements
		    for(int i =0; i < n; i++)
		     sb.append(temp[i] + " ");
		    System.out.println(sb);
		}
	}
}



// } Driver Code Ends


class Solution{
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(int arr[], int n){
        
        // Your code here
        //Initialising index of first minimum and first maximum element. 
    	int max_idx = n - 1, min_idx = 0; 
    
    	 //Storing maximum element of array.
    	int max_elem = arr[n - 1] + 1; 
    
    	for (int i = 0; i < n; i++) { 
    	    
    		//At even index, we have to put maximum elements in decreasing order. 
    		if (i % 2 == 0) { 
    			arr[i] += (arr[max_idx] % max_elem) * max_elem; 
    			//Updating maximum index.
    			max_idx--; 
    		} 
    
    		//At odd index, we have to put minimum elements in increasing order. 
    		else { 
    			arr[i] += (arr[min_idx] % max_elem) * max_elem; 
    			//Updating minimum index.
    			min_idx++; 
    		} 
    	} 
    
    	//Dividing array elements by maximum element to get the result. 
    	for (int i = 0; i < n; i++) 
    		arr[i] = arr[i] / max_elem;
        
    
    }
    
}


