#include<iostream>

using namespace std;

int main()

{
    int n;
    cin>>n;
    int k;cin>>k;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    swap(arr[k-1],arr[n-k]);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }

    return 0;

}
