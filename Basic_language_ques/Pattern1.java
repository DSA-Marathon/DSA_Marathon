import java.util.Scanner;
import java.io.IOException;

class Pattern1 {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        String[] S = findThePattern(N);
            
        for(int i=0; i<S.length; i++)
            System.out.println(S[i]);
        sc.close();
    }
    static String[] findThePattern(int N) {
        char ch='A';
        String temp="";
        String[] ans=new String[N];
        // Control rows
        for(int i=0;i<N;i++)
        {
            temp="";
            
            if(i==0 || i==N-1)
            {
                // control the columns of first and last row
                for(int j=0;j<N;j++)
                {
                    temp+=ch;
                    ch++;
                }
            }
            else
            {
                // Control the columns of rows other then first and last row
                temp+=ch;
                ch++;
                for(int j=0;j<N-2;j++)
                {
                    temp+='$';
                }
                temp+=ch;
                ch++;
            }
            ans[i]=temp;
        }
        return ans;
    }
}
/*
- As we observe in the pattern the rows and columns are equal to N(input)
so we run our first loop from 0 to N-1 to transverse along the rows.
- Further as we observe that only the first and the last line contains only alphabets in increasing order
and the remaining N-2 lines contain Alphabet on 0 and N-1 position and the rest positions have $.
- Also we have to return our answer as a String array which will contain rows at every index
- Here we store every row pattern in temp and finally store it in ans[i] and re-initialize temp will null value
*/
