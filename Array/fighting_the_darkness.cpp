// solution is in class Solution


//Initial template for C++

#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
//User function template for C++

class Solution{   
public:
    int maxDays(int arr[],int n){
        // code here 
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
};

// { Driver Code Starts.

int main() 
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin>>n;
        int arr[n];
        for(int i=0;i<n;i++)
            cin>>arr[i];
        Solution ob;
        cout << ob.maxDays(arr, n) << "\n";
    }
    return 0;
}  // } Driver Code Ends