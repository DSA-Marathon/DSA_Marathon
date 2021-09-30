// Solution at line 20

import java.io.*;
import java.util.*;
public class Sort_array_consisting_only_0_1_2 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        sort012(arr, n);
        for(int a:arr)
            System.out.print(a+" ");
        sc.close();
    }
    // Solution
    static void sort012(int a[], int n)
    {
        int a0=0,a1=0,a2=0;
        for(int i=0;i<n;i++)
        {
            switch(a[i])
            {
                case 0:a0++; break;
                case 1:a1++; break;
                default: a2++;
            }
        }
        int k=0;
        for(int i=0;i<a0;i++)
        {
            a[k]=0;
            k++;
        }
        for(int i=0;i<a1;i++)
        {
            a[k]=1;
            k++;
        }
         for(int i=0;i<a2;i++)
         {
            a[k]=2;
            k++;
         }
    }
}
/*
 We declare 3 variables to count the number of 0s 1s and 2s.
 Further we add 0s, 1s, and 2s in the array according to their numbers.
*/
   

