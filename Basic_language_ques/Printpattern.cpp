#include<iostream>
using namespace std;

int main()
{
    char c; 
    int n; 
    cin>>n;
   if(n==1){ 
       cout<<"A";
    }
   else{
    for(c=65;c<n+65;c++){
       cout<<c;
    }  
       cout<<endl; 
for(int i=1;i<=n-2;i++){ 
    cout<<c; 
    c++;  
    for(int j=1;j<=n-2;j++){ 
    cout<<"$";} 
    cout<<c<<endl;
    c++; 
    } 
    while(n--){ 
    cout<<c;
    c++;
    }
    } 
     
    
    return 0;
}