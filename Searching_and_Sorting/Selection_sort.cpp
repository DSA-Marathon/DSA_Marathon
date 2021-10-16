#include<iostream>

using namespace std;

int main()

{ int n; 

cin>>n;

int a[n];

  for(int i=0;i<n;i++){

cin>>a[i];

} int c;

   

    for(int i=0;i<n;i++){

    for(int j=i;j<n;j++){ 

    if(a[i]>a[j]){

     c=a[i]; 

    a[i]=a[j]; 

    a[j]=c;

    } 

    }

} 

  for(int i=0;i<n;i++){

cout<<a[i]<<" ";

}

    return 0;

}
