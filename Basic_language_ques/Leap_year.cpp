#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int main() {
    int testcase;
    cin>>testcase;
    while(testcase--){
        int year;
        cin>>year;
        if(year%400==0){
            cout<<"1"<<endl;
        }
 
        else if(year%100==0){
            cout<<"0"<<endl;
        }
 
        else if(year%4==0){
            cout<<"1"<<endl;
        }
        else{
            cout<<"0"<<endl;
        }
    }
    return 0;
}
//approach

// if year is divisible by 400 then is_leap_year
// else if year is divisible by 100 then not_leap_year
// else if year is divisible by 4 then is_leap_year
// else not_leap_year