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
int naive_approch_gcd(int a,int b){
	int res=min(a,b);
	while(!((a%res==0)&&(b%res==0))){
		res--;
	}
	return res;
}

// repetitive subtraction method of euclids division lemma
// gcd(a,b)=gcd(a-b,b)=gcd(a,b-a)
int repetitive_subtraction_gcd(int a,int b){
	while(a != 0 && b != 0){
		if(a>b)a=a-b;
		else b=b-a;
	}
	return a;
}

// optimized implementaion
// 1. iterative approch 
int euclids_iterative_gcd(int a,int b){
	while(b != 0){
		int c=a%b;
		a=b;
		b=c;
	}
	return a;
}


// 2. recursive approch
int euclids_recursive_gcd(int a,int b){
	if(b==0)return a;
	return euclids_recursive_gcd(b,a%b);
}


int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	puneetMode();

	int t=0;
	// cin>>t;t--;
	do{
		int a,b;cin>>a>>b;
		// cout<<naive_approch_gcd(a,b)<<endl;
		// cout<<repetitive_subtraction_gcd(a,b)<<endl;
		// cout<<euclids_iterative_gcd(a,b)<<endl;
		cout<<euclids_recursive_gcd(a,b);
	}while(t--);

	return 0;
}