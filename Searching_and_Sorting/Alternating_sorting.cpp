#include<iostream>

using namespace std;

int main()

{int n; 

cin>>n; 

   int b=n;

       int a[n];

    for(int i=0; i<n;i++){

    cin>>a[i];

    

    }

    sort(a,a+n);

    for(int i=0; i<n;i++){ 

    if(i<n-1){

    cout<<a[n-1]<<" "<<a[i]<<" ";

    n--;}

    } 

    int i;

    if(b%2!=0){

    cout<<a[b/2];}

    return 0;

}
