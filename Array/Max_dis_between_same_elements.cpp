#include<bits/stdc++.h>

using namespace std;

int main()

{

  int n; cin>>n; 

  int a[n],b[n]; 

    for(int i=0;i<n;i++){ 

        cin>>a[i]; 

    

    } 

    for(int i=0;i<n;i++){ 

        for(int j=i;j<n;j++){ 

      if(a[i]==a[j]){ 

           b[i]=j-i;} 

        }

           

    } 

    sort(b,b+n);

    cout<<b[n-1];

    

    return 0;

}
