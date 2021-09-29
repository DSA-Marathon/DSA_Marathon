import java.io.IOException;
import java.util.*; 


class sort_the_array{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt(); 
            int arr[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                arr[i] = sc.nextInt();
            }
            
            int []ans= sortArr(arr, n);
            for(int i=0;i<n;i++)
            {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    static int[] sortArr(int[] arr, int n) 
    { 
        Arrays.sort(arr);        
        return arr;
    }
}
/*
 Here we have used a predefined method of Arrays class which sort the array in ascending order.
 The worst case time complexity of this method is O(n * logn)
 */