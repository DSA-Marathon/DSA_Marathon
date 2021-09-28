#include <bits/stdc++.h>
using namespace std;


class Solution{
  public:
    //Function to count subarrays with 1s and 0s.
    long long int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        map<int,int>mp;
        int sum = 0,count=0;
        for (int i = 0; i < n; i++) 
        {
           if(arr[i]==0)
           {
              arr[i]=-1;
           }
        sum += arr[i];
        mp[sum]++;
     
        }  
        for(auto itr=mp.begin(); itr!=mp.end();itr++)
        {
           int s=itr->second;
           if(s>1)
           count+=s*(s-1)/2;
        }
         if (mp.find(0)!= mp.end())
         count += mp[0];
    return count;
    
    }
};



int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	int n,i;
	cin>>n;
	int arr[n];
	for(i=0;i<n;i++)
	cin>>arr[i];
	Solution obj;
	cout<< obj.countSubarrWithEqualZeroAndOne(arr, n)<<"\n";
	}
	return 0;
}
 