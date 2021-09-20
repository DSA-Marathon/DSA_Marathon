import java.io.IOException;
import java.util.Scanner;

 class palindromic_array{
     public static void main(String[] args)throws IOException {
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t-->0){
             int n=sc.nextInt();
             int[] a=new int[n];
             for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            palinArray(a, n);
         }
         sc.close();
     }
    static int palinArray(int[] a, int n)
    {
        int[] arr=new int[n];
        int temp=0;
        for(int i=0;i<n;i++){
            temp=a[i];
            while(temp>0){
                arr[i]=(arr[i]*10)+(temp%10);
                temp=temp/10;
            }
            if(a[i]!=arr[i])
                return 0;
        }
        return 1;
    }
 }
 /*
  Here our approach is to transverse across the array and store the reverse of elements at every index in a new Array (arr). 
  Then at the end of every iteration we compare the original and reversed values, if any of them are not equal then we return 0.
  As if even one number is not palindromic then the Array is not palindromic. 
  If the final return statement is reached means all the numbers were palindromic hence we return 1.
 */