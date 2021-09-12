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
        
        int result=0;
        
        if(N%400==0)
            result=1;
        else if(N%100==0)
            result=0;
        else if(N%4==0)
            result=1;
        else
            result=0;

        return result;

        /*
        You can also make use of operators as below
        if((N%4==0 && N%100 !=0) || (N%400 == 0))
            return 1;
        else
            return 0;
        */
    }
}
