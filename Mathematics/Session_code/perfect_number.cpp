#include<bits/stdc++.h>
using namespace std;
#define loop(i,l,h) for(int i=l;i<h;i++)
#define endl "\n"
typedef long long int ll;
typedef long double ld;


inline void puneetMode() {
	#ifndef ONLINE_JUDGE
		freopen("input.txt", "r", stdin);
		freopen("output.txt", "w", stdout);
	#endif // ONLINE_JUDGE
}
/* ***************************************************** */

bool isperfect(int n){
	int sum=1;
	for(int i=2;i*i<=n;i++){
		if(n%i ==0 && i*i==n){
			sum+=i;
		}
		else if(n%i==0){
			sum+=i;sum+=(n/i);
		}
	}
	if(sum==n)return true;
	return false;
}


int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	puneetMode();

	int t=0;
	// cin>>t;t--;
	do{
		int n;cin>>n;
		if(isperfect(n))cout<<"YES";
		else cout<<"NO";
	}while(t--);

	return 0;
}