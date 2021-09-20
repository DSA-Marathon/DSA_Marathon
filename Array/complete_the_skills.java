import java.io.IOException;
import java.util.Scanner;

class complete_the_skills{
    static int ca=0,cb=0;
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=3;

            long[] a=new long[n];
            for(int i=0;i<3;i++)
                a[i]=sc.nextLong();

            long[] b=new long[n];
            for(int i=0;i<3;i++)
                b[i]=sc.nextLong();
            
            scores(a, b);
            System.out.println(ca+" "+cb);
        }
        sc.close();
    }
    static void scores(long a[], long b[]) {
        ca=0; // On GFG use GFG.ca
        cb=0; // On GFG use GFG.cb 
        for(int i=0;i<3;i++){
            // if a[i] is greater than b[i] then we increament ca
            if(a[i]>b[i])
                complete_the_skills.ca+=1;
            // else if a[i] is less than b[i] then we increament cb
            else if(a[i]<b[i])
            // We do not provide else condition because nothing is to be done when the values are equal
                complete_the_skills.cb+=1;
        }
    }
}
