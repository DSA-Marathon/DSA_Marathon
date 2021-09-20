#include<iostream>

using namespace std;

int main()

{

    int t; cin>>t; while(t--){ 

    int n; cin>>n; 

    int a[n],b[n],c,d;

    for(int i=0;i<n;i++){ 

    cin>>a[i]; 

    b[i] =0; 

    d=a[i];

    while(d>0){

    c=d%10; 

    d=d/10; 

    b[i]=b[i]*10+c;

    }}   

    int f=0;

    for(int i=0;i<n;i++){ 

        if(a[i]!=b[i]){ 

        f=1;} 

        }  

        if(f==0) {cout<<"1"<<endl;}

    else{cout<<"0"<<endl;} 

    }

    return 0;

}
