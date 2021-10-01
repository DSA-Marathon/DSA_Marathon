#include<iostream>

using namespace std;

int main()

{int n,x,t; 

cin>>t;

while(t--){

cin>>n>>x; 

   

       int a[n];

    for(int i=0; i<n;i++){

    cin>>a[i];

    

    }

   int c=0;

    for(int i=0; i<n;i++){ 

    if(a[i]>x){

          c++; 

        }

    } 

    

    cout<<c<<endl;}

    return 0;

}
