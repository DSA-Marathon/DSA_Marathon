import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef{
     
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int p=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt(); 
            }
            Arrays.sort(arr);
               
            if(k>p){
                if(x>arr[p-1]) System.out.println("-1");
                else{
                    int op=0;
                    while(0<p&&arr[--p]>x){
                        op++;
                    }
                    System.out.println(op);
                }
            }
            else if(k<p){
                if(x<arr[p-1]) System.out.println("-1");  
                else{
                   int op=0;
                    while(p<=n&&arr[p-1]<x){
                        p++;
                        op++;
                    }
                    System.out.println(op);
                }
            }
            else{
                if(x<arr[p-1]){
                    int op=0;
                    while(0<p&&arr[--p]>x){
                        op++;
                    }
                    System.out.println(op);
                }
                else if(x>arr[p-1]){
                    int op=0;
                    while(p<=n&&arr[p-1]<x){
                        p++;
                        op++;
                    }
                    System.out.println(op);
                }
                else{
                    System.out.println("0");
                }
            }
               
               
        }
    }
}

