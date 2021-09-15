#include<iostream>
using namespace std;

int main(){
    int num,i;
    int fact,rem;
    cin>>num;
    int sum = 0;
    int temp = num;
    while(num)
   {
        i = 1,fact = 1;
        rem = num % 10;

        while(i <= rem)
        {
            fact = fact * i;
            i++;
        }
        sum = sum + fact;
        num = num / 10;
    }
    if(sum == temp){
        return 1;
    }

    else{
        return 0;;
    }
    return 0;
}
//find factorial of single digit
// then sum all the digits
//compare with original number
//if both are same then return 1 else return 0