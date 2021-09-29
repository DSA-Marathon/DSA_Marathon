import java.util.Scanner;
import java.io.IOException;

class peak_element{

    public static void main(String[] args)throws IOException{
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
		    int[] tmp=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				tmp[i] = a[i];
			}
		    
		    int f=0;
			int A=peakElement(tmp,n);
			
			if(A<0 && A>=n)
			    System.out.println(0);
			else
			{
    			if(n==1 && A==0)
    			    f=1;
    			else if(A==0 && a[0]>=a[1])
    			    f=1;
    			else if(A==n-1 && a[n-1]>=a[n-2])
    			    f=1;
    			else if(A >= 0 && A < n && a[A] >=a[A+1] && a[A]>= a[A-1])
    			    f=1;
    			else
    			    f=0;
			    System.out.println(f);
			}
		}
        sc.close();
    }
    static int peakElement(int[] arr,int n)
    {
        if(n>1&&arr[0]>arr[1])
            return 0;
        else if(n>1&&arr[n-2]<arr[n-1])
            return n-1;
        else if(n==1)
            return 0;
        else
        {
           int i;
           for(i=1;i<n-1;i++)
           {
               if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
               {
                   return i;
               }
           }
        }
        return 0;
    }
}

