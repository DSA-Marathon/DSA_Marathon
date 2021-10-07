#include<iostream>

using namespace std;

int main()

{

    int n; 

    cin>>n; 

    string s,b; 

    cin>>s; 

    int a[n]; 

    for(int i=0;i<n;i++){

    a[i]=s[i];

    } 

    sort(a,a+n); 

    for(int i=0; i<n;i++){

    b[i]=a[i];

    cout<<b[i];

    } 

    return 0;

}
