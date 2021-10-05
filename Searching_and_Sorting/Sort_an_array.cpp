#include<iostream>
#include<bits/stdc++.h>
using namespace std;

class solution
{
public:
void sort012(int a[], int n)
{
return sort(a,a+n);     //Here we directly provided a sorted array by function sort..
}
};


int main(){
int t;
cin>>t;
while(t--){
int a[n];
for(int i=0;i<n;i++){
cin>>a[i];
}

solution ob;                   //Calling of class;
ob.sort012(a,n);               //Calling of object sort012;

for(int i=0;i<n;i++){
cout<<a[i] <<" ";
}
 cout<<endl;

}
return 0;
}
