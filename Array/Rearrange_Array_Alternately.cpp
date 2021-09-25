#include<iostream>

using namespace std;

int main()

{   

     long long int n;

     cin>>n;  

 

    int a[n]; 

    

    for(int i=0;i<n;i++){ 

       cin>>a[i]; 

        }

        if(n%2==0){

   for(int i=0;i<n;i++){

       cout<<a[n-1]<<" "<<a[i]<<" ";

       n--; 

       

        } }

      else{  for(int i=0;i<n;i++){ 

         if(i!=n-1){

       cout<<a[n-1]<<" "<<a[i]<<" ";

       n--; 

       

       } 

    else {cout<<a[i];} }} 

       

       

    return 0;

}
