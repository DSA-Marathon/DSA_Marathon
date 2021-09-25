import java.io.IOException;
import java.util.*;

class Fascinating_number{
    public static void main(String args[])throws IOException {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T-->0) {
            long n = sc.nextLong();

            String s = Long.toString(n * 1) + Long.toString(n * 2) +
                       Long.toString(n * 3);
            
            if (ob.fascinating(s))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
        }
        sc.close();
    }
}


class Solution {
    boolean fascinating(String q) {
        int A[] =new int[10]; // By default 0 is assigned to every index
        // to store count of every digit from '0' to '9'
        int flag = 0;
        char ch;
        for (int i = 0; i < q.length(); i++) {
            ch = q.charAt(i);
            A[ch - 48]++;
        }

        for (int i = 1; i < 10; i++) {
            // checking if every digit from '1' to '9' are present exactly once
            // or not
            if (A[i] != 1) {
                flag = 1; // flag is set to 1 if frequency is not 1
                break;
            }
        }

        if (flag == 1)
            return false;
        else
            return true;
    }
}