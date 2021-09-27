//Solution at line 34

import java.util.*;
import java.lang.*;
import java.io.*;

class Searching_an_element
{
    
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0)
        {
            
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            Solution obj=new Solution();
            System.out.println(obj.searchInSorted(arr, n, k));
        }
        sc.close();
    }
}

//Solution
class Solution{
    int searchInSorted(int arr[], int N, int K)
    {
        
        int j=N-1;
        int res=BinarySearch(arr,0,j,K);
        if(res==-1)
            return res;
        return 1;
    }
    static int BinarySearch(int arr[],int l,int r,int k)
    {
        
        if(r>=l)
        {
            int mid=(l+r)/2;
            if(arr[mid]==k)
                return 1;
            if(k>arr[mid])
                return BinarySearch(arr,mid+1,r,k);
            else
                return BinarySearch(arr,l,mid-1,k);
            
        }   
        return -1;
    }
}