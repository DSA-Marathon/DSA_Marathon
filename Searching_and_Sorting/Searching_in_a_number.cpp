#include<iostream>

using namespace std;

int main()

{

    int n,k; 

    cin>>n>>k; 

    int a[n],f=0;

    for(int i=0;i<n;i++){

        cin>>a[i];

        if(a[i]==k){

          cout<<i+1;

        i=n;

        f=1;

       }

       }

    if(f==0){

          cout<<"-1"; 

    }

    return 0;

}
