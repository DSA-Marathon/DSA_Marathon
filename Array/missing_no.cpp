// answer in class solution from line no 15 to 27


// Initial template for C++

#include <bits/stdc++.h>
using namespace std;




 // } Driver Code Ends
// User function template for C++

class Solution{
  public:
    int MissingNumber(vector<int>& array, int n) {
        bool arr[n+1]={0};
        for(int i=0; i<n-1; i++)
            arr[array[i]]=1;
        
        int ans =0;
        for(int i=1; i<=n; i++)
            if(arr[i]==0) 
                return i;
    }
};

// { Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;

        vector<int> array(n - 1);
        for (int i = 0; i < n - 1; ++i) cin >> array[i];
        Solution obj;
        cout << obj.MissingNumber(array, n) << "\n";
    }
    return 0;
}  // } Driver Code Ends