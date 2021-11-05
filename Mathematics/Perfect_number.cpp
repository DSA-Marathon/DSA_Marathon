#include<bits/stdc++.h>
#include<iostream>
using namespace std;

class solution{                                                    //declaring class of public type
public:
int isPerfectNumber(long long N){
if(N==1)
return 0;

int sum=1;
for(int i=2;i<=sqrt(N);i++){
if(N%i==0){
sum+=i;
sum+=N/i;
}
}
return sum==N? 1:0;                                                   // Rturning the value of sum to the main function
}
};

int main(){
int t;
cin>>t;
while(t--){
long long N;
cin>>N;
solution ob;
cout<<ob.isPerfectNumber(N)<<endl;
}
return 0;
}
