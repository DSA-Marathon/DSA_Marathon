#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() {
    int num;
    cin>>num;
    if(num==1 || num<10)
    {
        cout<<"1"<<endl;
    }
    else if(num==10 || num<100)
    {
        cout<<"2"<<endl;
    }
    else if(num==100 || num<1000)
    {
        cout<<"3"<<endl;
    }
    else
    {
        cout<<"More than 3 digits"<<endl;
    }
	
	return 0;
}
// Print "1" if nuum is a 1 digit number.
// Print "2" if num is a 2 digit number.
// Print "3" if num is a 3 digit number.
// Print "More than 3 digits" ifnum has more than 3 digits.