#include<iostream>

using namespace std;

int main()

{

  int a[30000];

  int n; 

  cin>>n; 

a[0]=1;

  int num=0,l=1,carry;

  for(int i=2;i<=n;i++){

for(int j=0;j<l;j++){

   num=a[j]*i+num;

    if(j+1==l){ 

    carry=num;

    while(carry){

    a[j]=carry%10; 

    carry=carry/10;

    j++;

    l++;

    }

    j=l;

    num=0;

    }

    else{

    a[j]=num%10;

    num=num/10;}

} 

}int c=0;

for(int i=0;i<l;i++){

 if(a[i]==0){

 c++;}

else{i=l;}

}cout<<c;

    return 0;

}
