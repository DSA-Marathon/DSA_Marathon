#include<bits/stdc++.h>

using namespace std;

int main()

{

    int n; 

    cin>>n; 

    int a[n],b[n];

    for(int i=0;i<n;i++){

        cin>>a[i];

       }

    sort(a,a+n); 

    for(int i=0;i<n-1;i++){

        b[i]=a[i+1]-a[i];

       } 

    sort(b,b+n-1); 

    cout<<b[0];

    return 0;

}
