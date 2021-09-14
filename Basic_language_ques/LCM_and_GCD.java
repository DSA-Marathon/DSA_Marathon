import java.util.Scanner;
import java.io.*;

public class LCM_and_GCD {
    public static void main(String[] args)throws IOException 
    {
        Scanner sc=new Scanner(System.in);
        Long A=sc.nextLong();
        Long B=sc.nextLong();
        
        Long ptr[]=lcmandgcd(A, B);

        System.out.println(ptr[0]+" "+ptr[1]);
        sc.close();
    }
    // On GFG they have made a seperate Solution Class but here I am not creating seperate class
    static Long[] lcmandgcd(Long A, Long B)
    {
        Long ans[]=new Long[2];

        ans[1]=find_gcd(A, B); // GCD or HCF
        // LCM of A and B x HCF of A and B = A x B
        // LCM * GCD = A * B
        ans[0]=(A*B)/ans[1]; // LCM

        return ans;
    }
    static Long find_gcd(Long a, Long b)
    {
        //This is Euclid's Algorithm to find GCD
        if(b==0)
            return a;

        return find_gcd(b, a%b);
    }
}
