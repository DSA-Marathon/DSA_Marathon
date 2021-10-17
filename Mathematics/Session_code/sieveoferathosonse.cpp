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

bool* sieve(int n){
	bool* prime;
	prime=new bool(n+1);
	for(int i=0;i<n+1;i++)prime[i]=true;
	prime[0]=false;
	prime[1]=false;
	for(int i=2;i*i<=n;i++){
		if(prime[i]){
			for(int j=i*2;j<=n;j+=i){
				prime[j]=false;
			}
		}
	}

	return prime;
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
		bool* prime=sieve(n);
		for(int i=0;i<n+1;i++){
			cout<<i<<" "<<prime[i]<<endl;
		}
	}while(t--);

	return 0;
}