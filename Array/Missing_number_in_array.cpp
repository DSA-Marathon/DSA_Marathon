#include<bits/stdc++.h>

using namespace std;

int main()

{   

     long long int n,c;

     cin>>n;  

    c=n-1;

    int a[c]; 

    

    for(int i=0;i<c;i++){ 

       cin>>a[i]; 

        }

    

     sort(a,a+c) ;  

    int f=0;

    for(int i=0;i<c-1;i++){

        if(a[i]+1!=a[i+1]){

           cout<<a[i]+1; 

            i=c; 

            f=1;

        } 

        } 

        if(f==0){cout<<n;}

    return 0;

}
