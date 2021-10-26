#include<iostream>

using namespace std;

int main()

{

    int n;

    cin>>n; 

    int a[n],c=0,i=0;

     while(n>0){

    a[i]=n%10;

    n=n/10;

    c++;

    i++;

    }

    int b=c/2,d=0,e=0;

    for(i=0;i<b;i++){

    d+=a[i];

    }

    for(i=b+1;i<c;i++){

    e+=a[i];

    }

    if(d==e){cout<<"1";}

    else{cout<<"0";}

    return 0;

}
