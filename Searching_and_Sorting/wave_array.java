// Solution at line 30

import java.io.IOException;
import java.util.*;

class wave_array {
    
	public static void main (String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();	//Inputting the test cases
		while(t-->0)
		{
		    int n = sc.nextInt();// taking size of array
		    int arr[] = new int[n]; // declaring array of size n
		    for(int i=0; i<n; i++){
		        arr[i]=sc.nextInt(); // input elements of array
		    }
		    convertToWave(arr, n);
		    
		    StringBuffer sb = new StringBuffer(); 
            for (int i = 0; i < n; i++) 
                sb.append(arr[i] + " "); 
                
		    System.out.println(sb); // print array
            sc.close();
		}
	}
    //Solution
    public static void convertToWave(int arr[], int n){
        
        Arrays.sort(arr);
        //Swapping logic
        int temp=0;
        for(int i=0;i<n-1;i+=2)
        {
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            /*
             You can also use Bit Manipulation to swap
             arr[i]=arr[i]^arr[i+1];
             arr[i+1]=arr[i]^arr[i+1];
             arr[i]=arr[i]^arr[i+1];
             */
        }
        
    }
}
/*
The approach is to use sorting. First sort the input array, then swap all adjacent elements.
For example, let the input array be {3, 6, 5, 10, 7, 20}. After sorting, we get {3, 5, 6, 7, 10, 20}. After swapping adjacent elements, we get {5, 3, 7, 6, 20, 10} which is the desired array.
 */



    
    
    
    
