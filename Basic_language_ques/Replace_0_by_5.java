import java.io.IOException;
import java.util.Scanner;

class Replace_0_by_5{
    public static void main(String[] args)throws IOException 
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        System.out.println(convertfive(num));   
        sc.close();    
    }
    static int convertfive(int num) 
    {      
        int temp=0,n=0;
         /*
        We will transverse along the number to check all it's digit and replace the digit with 5 if it is 0.
        For thi we can easily apply the approach used in reversing a number.
        The same is applied below :
        */
         while(num>0)
         {
                        
             if(num%10!=0) // Remainder of a number with 10 is it's last digit
             {
             // If last digit is not 0 then we add it in temp according it's place value
                temp=temp*10+num%10;                 
             }  
             else
             {
                // If last digit is 5 then we add 5 in temp according it's place value
                temp=temp*10+5;
             }

             num/=10; // Dividing a number with 10 remove it's last digit
         }
         // Now we have our desired number in temp but it is in reversed form.
         // So we have to reverse it again.
         while(temp>0)
         {
             n=n*10+temp%10;
             temp/=10;
         }
         // We have stored the reversed value of temp in 'n' now simply return 'n'
         return n;
     }
}
