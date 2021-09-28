import java.io.*;
import java.util.*;

class Searching_a_number {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
        
            int n = sc.nextInt();
            int k = sc.nextInt();          
            
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = search(arr, n, k);

            System.out.println(ans);
            sc.close();
        }
    }
    //Solution
    static int search(int arr[], int n, int k) {

        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
                return i+1;
        }
        return -1;
    }
}
/*
 We transverse accross the array to search for 'k' and return 'index+1' (position of element) if we find 'k'.
 If the outer return statement return -1 which will get executed only if k is not present in array.
 */