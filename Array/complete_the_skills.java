import java.io.IOException;
import java.util.Scanner;

class complete_the_skills{
    static int ca=0,cb=0;
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=3;

        long[] a=new long[n];
        for(int i=0;i<3;i++)
            a[i]=sc.nextLong();

        long[] b=new long[n];
        for(int i=0;i<3;i++)
            b[i]=sc.nextLong();
        
        solution obj=new solution();
        obj.scores(a, b);
        System.out.println(ca+" "+cb);
        }
        sc.close();
    }
    class solution{
        public void scores(long a[], long b[]) {
            complete_the_skills.ca=0;
            complete_the_skills.cb=0;
            for(int i=0;i<3;i++){
                if(a[i]>b[i])
                    complete_the_skills.ca+=1;
                else if(a[i]<b[i])
                    complete_the_skills.cb+=1;
            }
        }
    }
}
