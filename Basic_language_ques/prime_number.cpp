#include <iostream>
using namespace std;

// naive approch
/*
bool isprime(int n){
	if(n==1)return false;
	if(n==2)return true;
	else {
		for(int i=2;i<n;i++){
			if(n%i ==0)return false;
		}
	}
	return true;
}
*/


// root n approch

int isprime(int n){
	if(n==1)return false;
	if(n==2)return true;
	else {
		for(int i=2;i*i<=n;i++){
			if(n%i ==0)return false;
		}
	}
	return true;
}

int main(){
		#ifndef ONLINE_JUDGE
		freopen("input.txt", "r", stdin);
		freopen("output.txt", "w", stdout);
	#endif // ONLINE_JUDGE
	int n;cin>>n;
	if(isprime(n))cout<<"Prime Number";
	else cout<<"Not a prime number";
	return 0;
}
