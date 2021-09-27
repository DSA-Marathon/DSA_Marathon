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

          

       

        f=1;

       }

       }

    if(f==1){

          cout<<"1"; 

    }

    else{cout<<"-1";}

    return 0;

}
