#include <iostream>

▾ using namespace std; 
int main() {

int t; cin>>t; while(t--){

int n,k;

cin>>n>>k;

int a[n],c=0;

for(int i=0;i<n;i++){

cin>>a[i]; 
  if(a[i]>k){

c++;

} 
} 
  cout<<c<<endl; 

}

return 0;

}
