import java.util.Scanner;
import java.io.IOException;

public class dice 
{
    public static void main(String[] args)throws IOException 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(7-n);
        sc.close();
    }
}

/*
->The idea is that the sum of two opposite faces of dice is 7.
-> Using this fact by knowing one face the other one can be obatained.
*/