import java.util.Scanner;
import java .io.IOException;

class Strong_number{
    public static void main(String[] args)throws IOException 
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        System.out.println(isStrong(N));
        sc.close();       
    }
    static int isStrong(int N) 
    {
        long sum=0,fact=1;
        int temp=N;
        while(temp>0)
        {
            fact=1;
            for(int i=2;i<=(temp%10);i++)
            {
                fact*=i;
            }
            sum+=fact;
            temp/=10;
        }
        if(N==sum)
            return 1;
        return 0;
    }
}
/* 
We transverse along the number using fact that remainder of number with 10 gives last digit of number.
    We find factorial of each digit and store it in variable fact for every digit and add the value of fact to sum in every iteration.
    At the end we have sum of the factorial of all the digits of number N in sum.
    Now we compare sum with N if both are equal then we return 1 else we return 0.
 */