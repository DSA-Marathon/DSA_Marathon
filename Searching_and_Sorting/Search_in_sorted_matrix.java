import java.io.*;
import java.util.*;

class Search_in_sorted_matrix{
    // Solution
    static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<m;j++)
	        {
	            if(matrix[i][j]==x)
	            {
	                return true;
	            }
	        }
	    }
	    return false;
	}
	/*
	 We transverse through all the rows and columns of the matrix to find the element.
	*/
	public static void main(String args[]) throws IOException { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
       		int rows=sc.nextInt();
       		int columns=sc.nextInt();
			
			int matrix[][]=new int[rows][columns];
          
        	for(int i=0; i<rows;i++){            
            	for(int j=0; j<columns;j++){
                	matrix[i][j]=sc.nextInt();
            	}
         	}
         	int target = sc.nextInt();
			
			if (search(matrix, rows, columns, target)) 
				System.out.println(1); 
			else
				System.out.println(0); 

		}
        sc.close();
	} 
}


