#include<iostream>

using namespace std;

int main()

{ int n; 

cin>>n;

int a[n];

  for(int i=0;i<n;i++){

cin>>a[i];

} int c;

   int m=n;

    for(int i=0;i<m;i++){

    for(int j=0;j<n-1;j++){ 

    if(a[j]>a[j+1]){

     c=a[j]; 

    a[j]=a[j+1]; 

    a[j+1]=c;

    } 

    }n--; 

  }

  for(int i=0;i<m;i++){

cout<<a[i]<<" ";

}

    return 0;

}
