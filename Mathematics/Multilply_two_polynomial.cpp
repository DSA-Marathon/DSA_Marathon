#include<iostream>

using namespace std;

int main()

{ 

int m,n; 

cin>>m>>n; 

int a[m],b[n],c[m*n];

for(int i=0;i<m;i++){

cin>>a[i];

}

for(int i=0;i<n;i++){

cin>>b[i];

}int l=n;

for(int i=0;i<m;i++){

c[i+n-1]=0;

for(int j=0;j<n;j++){

if(i==0){

c[j]=a[i]*b[j];

}

else{

c[i+j]=a[i]*b[j]+c[i+j];

}

} 

if(i!=0){l++;}

}

for(int i=0;i<l;i++){

cout<<c[i]<<" ";

}

    

    return 0;

}
