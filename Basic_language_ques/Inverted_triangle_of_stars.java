import java.util.Scanner;
import java.io.*;

public class Inverted_triangle_of_stars {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=n;i>=1;i--)
        {
            //This loop controls(adds) the preceding space 
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            
            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");

            System.out.println("");
        }
        sc.close();
    }
}
