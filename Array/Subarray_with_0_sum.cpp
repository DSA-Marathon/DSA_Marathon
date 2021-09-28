#include <bits/stdc++.h>
using namespace std;


class Solution{
    public:
    //Complete this function
    //Function to check whether there is a subarray present with 0-sum or not.
    bool subArrayExists(int arr[], int n)
    {
        unordered_map<int, int> mp;
        int total = 0;

        for(int i = 0; i < n; i++) {
        total = total + arr[i];
        if(mp.count(total) || arr[i] == 0 || total == 0) 
        return true;

        else 
        mp[total]++;
        }

        return false;
    }
};


int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    int arr[n];
	    for(int i=0;i<n;i++)
	    cin>>arr[i];
	    Solution obj;
	    	if (obj.subArrayExists(arr, n))
		cout << "Yes\n";
	else
		cout << "No\n";
	}
	return 0;
}  