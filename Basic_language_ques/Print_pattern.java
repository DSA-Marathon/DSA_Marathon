import java.util.Scanner;
import java.io.*;

public class Print_pattern
{
    public static void main(String[] args)throws IOException 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        char ch=(char)('a'+n-1);
        for(int i=0;i<n;i++)
        {
            //This loop controls preceding space
            for(int j=0;j<=(n/2)-i+1;j++)
                System.out.print(" ");
            
            for(int j=0;j<=i;j++)
                System.out.print((char)(ch-i+j)+" ");
                
            System.out.println("");
        }
        sc.close();
    }
}