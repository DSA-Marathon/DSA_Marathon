//Solution at Line 50

import java.io.IOException;
import java.util.*;

public class Common_elements
{
    public static void main(String args[])throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            ArrayList<Integer> res = commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
        sc.close();
    }
    //Solution
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> li=new ArrayList<>();
        int i=0,j=0,k=0,f=0;
        while(i<n1 && j<n2 && k<n3)
        {
            if(A[i]==B[j] && B[j]==C[k] && f!=A[i])
            {
                f=A[i];
                li.add(A[i]);
                i++;j++;k++;
            }
            else if(A[i]<B[j])
                i++;
            else if(B[j]<C[k])
                j++;
            else
                k++;
        }
        return li;
    }
}
/*
 As the three arrays are sorted, we can compare them in single transversal.
 we compare values of A[i], B[j] and C[k] we increment the index variable of an array if it is smaller than others
 and if all the three are equal then we add the element to our list and variable f.
 The value is stored in variable f to check for duplicate values.
 The f gets reinitialized for every unique common element in the three arrays.
 */

