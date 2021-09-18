import java.io.*;
import java.util.Scanner;

public class How_many_digits_i_have {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num==1 || num<10)
            System.out.println(1);

        else if(num==10 || num<100)
            System.out.println(2);

        else if(num==100 || num<1000)
            System.out.println(3);

        else
            System.out.println("More than 3 digits");
        sc.close();
    }
}
// Print "1" if nuum is a 1 digit number. 
// Print "2" if num is a 2 digit number.
// Print "3" if num is a 3 digit number.
// Print "More than 3 digits" if num has more than 3 digits.