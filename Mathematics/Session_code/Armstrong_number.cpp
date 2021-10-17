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

bool isarmstrong(int n){
	int digit=(int)log10(n)+1;
	int on=n;
	int armst=0;
	while(n>0){
		int last=n%10;
		int x=(ceil(pow(last,digit)));
		armst=armst+x;
		n/=10;
	}
	if(armst== on)return true;
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
		if(isarmstrong(n))cout<<"YES";
		else cout<<"NO";
	}while(t--);

	return 0;
}