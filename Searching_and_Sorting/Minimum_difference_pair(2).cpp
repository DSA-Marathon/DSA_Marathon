#include<iostream>
#include<bits/stdc++.h>

usign namespace std;

int main(){
int n,min,t;
cin>>n;
int arr[n];
for(int i=0;i<n;i++)
{
cin>>arr[i];
}
min=arr[0]-arr[1];

for(int i=;i<n;i++){
t=arr[i]-arr[i+1];
if(t<min){
min=t;
}
}
cout<<min;
  
return 0;

}
