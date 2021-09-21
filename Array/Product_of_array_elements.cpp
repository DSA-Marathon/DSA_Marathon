#include<iostream>

using namespace std;

int main()

{    int t;  

      cin>>t; 

     while(t--){ 

     long long int n;

     cin>>n; 

    int a[n];

    long long int c=1;

    for(int i=0;i<n;i++){ 

       cin>>a[i]; 

   

       c=c*a[i];

       }

    

      cout<<c<<endl;  

    }

    return 0;

}
