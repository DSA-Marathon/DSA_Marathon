#include<iostream>
#include<bits/stdc++.h>

using namespace std;
void multiply(int a[][100],int b[][100],int c[][100], int n);
int main(){
 int  t;
cin>>t;
while(t--){
int n;
cin>>n;
int a[100][100],b[100][100],c[100][100];
for(int i=0;i<n;i++)
for(int j=0;j<n;j++)
cin>>a[i][j];

for(int i=0;i<n;i++)
for(int j=0;j<n;j++)
cin>>b[i][j];

multiply(A,B,C,N);
for(i=0;i<n;i++){
for(j=0;j<n;j++)
cout<<C[i][j]<<" ";
}
cout<<endl;
}
return 0;
}

void multiply(int a[][100],int b[][100],int c[][100], int n){
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
int v=0;
for(int k=0;k<n;k++){
v+=a[i][k]*b[k][j];
}
c[i][j]=v;
}}
}
