#include<iostream>

using namespace std;

int main()

{

    int n,m,k; 

    cin>>n>>m>>k; 

    int a[n][m],i,j; 

    for(i=0;i<n;i++){ 

    for(j=0;j<m;j++){

     cin>>a[i][j];

    }

    }  

    int c;

    while(k--){

     for(j=m;j>1;j--){ 

    for(i=0;i<n;i++){ 

        

        c=a[i][j-2];

        a[i][j-2] = a[i][m-1];

        a[i][m-1]=c;

       

         

   }

    }   

   

    }

    for(i=0;i<n;i++){ 

    for(j=0;j<m;j++){

         cout<<a[i][j]<<" ";

    }

    cout<<endl; }

    

    

    

    return 0;

        

}
