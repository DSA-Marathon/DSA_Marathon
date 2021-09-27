import java.util.Scanner;

class Multiply_matrices{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			int[][] b = new int[n][n];
			int[][] c = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j]=sc.nextInt();
			for(int i = 0 ;i < n; i++)
				for(int j = 0; j < n; j++)
					b[i][j]=sc.nextInt();

			multiply(a,b,c,n);
			for (int i = 0; i < n; i++)
			{
                for (int j = 0; j < n; j++)
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
            
		}
        sc.close();
	}
    static void multiply(int A[][], int B[][], int C[][], int N)
        {
         
           for(int i=0;i<N;i++)
           {
               for(int j=0;j<N;j++)
               {
                   for(int k=0;k<N;k++)
                   {
                       C[i][j]+=A[i][k]*B[k][j];
                   }
               }
           }
        }
}


