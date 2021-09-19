import java.io.IOException;
import java.util.Scanner;

class Swap_kth_element{
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        swapKth(arr, n, k);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        sc.close();
    }
    static void swapKth(int arr[], int n, int k) {
        int temp=0;
        temp=arr[k-1];
        arr[k-1]=arr[n-k];
        arr[n-k]=temp;
    }
}