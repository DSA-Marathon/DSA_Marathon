//Solution at line 23

import java.util.*;
import java.io.IOException;
class Minimum_difference_pair
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = sc.nextInt();
        
            int ans = minimum_difference(nums);
            System.out.println(ans);
        }
        sc.close();
    }
    //Solution
    static int minimum_difference(int[] nums)
    {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int sub=0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++)
        {
            sub=nums[i+1]-nums[i];
            if(sub<min)
                min=sub;
        }
        return min;
    }
}
/*
 We first sort the given array and check subtraction of all the (i+1)th and ith elements for minimum value.
*/