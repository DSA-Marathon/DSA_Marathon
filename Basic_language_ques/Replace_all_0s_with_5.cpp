#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    int k,r ;
    k=0 ;
   
    while(n!=0)
    {
        r=n%10 ;
        if(r!=0)
            k=k*10+r ;
        else
            k=k*10+5 ;
        n=n/10 ;
    }
   
    while(k!=0)
    {
        r=k%10 ;
        n=n*10+r ;
        k=k/10 ;
    }
   cout<<n<<endl;
    

    return 0;

}
// Create a variable k = 0 to store the sum, place = 1 to store the place value of the current digit,
 //and create a copy of the input variable
// If the number is zero return 5
// Iterate the next step while the input variable is greater than 0
// Extract the last digit (n%10) and if the digit is zero, then update k = k + place*5,
// remove the last digit from the number n = n/10 and update place = place * 10
