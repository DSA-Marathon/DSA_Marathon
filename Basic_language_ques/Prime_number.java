import java.util.Scanner;
import java.io.*;

public class Prime_number 
{
    public static void main(String[] args)throws IOException 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(isPrime(n));
    }
    static int isPrime(int n)
    {
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                    return 0;
            }
        }

        return 1;
    }

}
    // On GFG they have made a seperate Solution Class but here I am not creating seperate class

    /*
    //APPROCH : 1
    // Brute force : check linearly from 2 to n whether there is any number that divides n
    // edge case is to handle for the n=1 and n=2

    // naive approch

    static int isprime(int n){
        if(n==1)return 0;
        if(n==2)return 1;
        else {
            for(int i=2;i<n;i++){
                if(n%i ==0)return 0;
            }
        }
        return 1;
    }
    */
    //APPROCH : 2 (used above)
    // root n approch
    // Approch 1 can be optimized by using fact that a non prime number has one of its factor between 1 and root of n
    // so it is better to run loop till square root of n rather checking till n.

 
/*
Why running loop till root of n
Example : in case of 36
1 * 36 = 36
2 * 18 = 36
3 * 13 = 36
4 * 9 = 36
6 * 6 = 36
9 * 4 = 36 // Repeated case (4 * 9)
13 * 3 = 36 // Repeated case (3 * 13)
18 * 2 = 36 // Repeated case (2 * 18)
36 * 1 = 36 // Repeated case (1 * 36)
So we can find all the possible number that divide n between 1 and square of n(inclusive)
 */