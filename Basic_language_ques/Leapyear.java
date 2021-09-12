import java.util.*;
import java.io.*;

public class Leapyear 
{
    public static void main(String[] args)throws IOException 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isLeap(n));
        sc.close();
    }
    static int isLeap(int N)
    {
        
        int r=0;

        if(N%400==0)
            r=1;
        else if(N%100==0)
            r=0;
        else if(N%4==0)
            r=1;
        else
            r=0;

        return r;
    }
}
