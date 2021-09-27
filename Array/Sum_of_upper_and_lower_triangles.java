import java.io.IOException;
import java.util.*;

class Sum_of_upper_and_lower_triangles
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++)
                    matrix[i][j] = sc.nextInt();

            ArrayList<Integer> ans = sumTriangles(matrix,n);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            sc.close();
        }
    }
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int upper=0,lower=0;
        //This loop tranverse through rows
        for(int i=0;i<n;i++){
            //This loop transverse through columns
            for(int j=0;j<n;j++)
            {
                if(i>=j)
                    lower+=matrix[i][j];
                if(i<=j)
                    upper+=matrix[i][j];
            }
        }
        list.add(upper);
        list.add(lower);
        return list;
    }
}
/*
 All the lower triangle elements lie where the row index is greater than or equal to column index
 And all the upper triangle elements lie where the row index is less than or equal to column index
*/
