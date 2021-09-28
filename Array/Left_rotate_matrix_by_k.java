//Solution at line 29

import java.io.IOException;
import java.util.Scanner;

class Left_rotate_matrix_by_k{
    public static void main(String[] args)throws IOException {
        //Inputs
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int M=sc.nextInt();
            int K=sc.nextInt();
            int[][] Mat=new int[N][M];
            for(int i=0;i<N;i++)
                for(int j=0;j<M;j++)
                    Mat[i][j]=sc.nextInt();
            int ans[][]=rotateMatrix(N, M, K, Mat);
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++)
                    System.out.print(ans[i][j]+" ");
                System.out.println("");
            }
        }
        sc.close();
    }
    //Solution
    static int[][] rotateMatrix(int N, int M, int K, int Mat[][]) {
        
        if(K>M)
            K=K%M;
        int[][] ans=new int[N][M];
        int column1=0,column2=0;
        for(int i=0;i<N;i++)
        {
            column2=K;
            column1=0;
            for(int j=0;j<M;j++)
            {
                ans[i][column1++]=Mat[i][column2++];
                if(column2==M)
                    column2=0;
            }
        }
        return ans;
    }
}
/*
 We trim the matrix in two parts and store the half parts with their positions interchanged in new matrix and return the new matrix as answer.
 */