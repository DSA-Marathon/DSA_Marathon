#include<iostream>

using namespace std;

void subarraysum(int arr[],int n)
{
   int sum=0;
   bool ans=false;
   for(int i=0;i<n;i++)
   {
       sum+=arr[i];
       if(sum==0 || arr[i]==0)
       {
           ans=true;
       }
   }
    if(ans==true)
    cout<<"YES"<<endl;
    else
    cout<<"NO"<<endl;
}

int main()
{
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
    }

    subarraysum(arr,n);
    
    return 0;

}