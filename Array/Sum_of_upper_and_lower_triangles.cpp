#include<iostream>

using namespace std;

int main()

{

    int n; 

    cin>>n; 

    int a[n][n],i,j,c=0; 

    for(i=0;i<n;i++){ 

    for(j=0;j<n;j++){

     cin>>a[i][j];

    }

    } 

    

     for(i=0;i<n;i++){ 

    for(j=i;j<n;j++){

         c=c+a[i][j];

    }  

    

    }   

   

    cout<<c<<" ";

     c = 0;

    for(i=0;i<n;i++){ 

    for(j=0;j<i+1;j++){

         c=c+a[i][j];

    } }

    

    cout<<c;

    

    return 0;

        

}
