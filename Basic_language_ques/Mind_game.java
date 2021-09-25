import java.util.Scanner;
import java.io.IOException;

class Mind_game{
    public static void main(String[] args)throws IOException 
    {
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();

        System.out.println(mindGame(K));

        sc.close();
    }
    static int mindGame(int K) 
    {
        return K/2;
    }
}
/* The approach to this question is very easy and simple, first of all read the steps given in question carefully.

So let us understand these steps with an example :

Step 1: Chose a random number between 1 and 10.  
// let us assume the number to be N=8

Step 2: Double the chosen number. 
// 8 * 2 = 16 (N is doubled)

Step 3: Add the number K(even number given as input) to the number obtained after Step1  
// 16 + 10 = 26  (let K =10) (double of N is added to K)

Step 4: Divide the obtained number in Step 2 by 2. 
// 26/2 = 13 
// or 16/2 + 10/2 =  8(assumed number N) + 5(half of K) (K and double of N become half)
// So the expression obtained after step 4 is nothing but sum of assumed number N and K/2

Step 5: Now subtract the obtained number in Step 3 with the original chosen number N 
// 13 - 8 = 5 or  8 + 5 - 8 = 5(i.e. K/2= 10/2)
// Finally in this step we subtract assumed number from the expression obtained in step 4 so we are left with K/2 as our final answer

So as we observed whatever be the value of N the answer will always be K/2

I think everyone will understand this question easily as this is one the game we used to play in our childhood. If you still have confusion then try to take few more examples, still you have some doubt then feel free to ping us on our Discord Server.
 */