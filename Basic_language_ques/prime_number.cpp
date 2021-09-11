#include <iostream>
using namespace std;
/*
//APPROCH : 1
// Brute foruce : check for n that is there any factor of n exist other 1 and itself by simply traversing
// edge case is to handle for the n=1 and n=2

// naive approch

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

//APPROCH : 2
// root n approch
// Approch 1 can be optimized by using fact that a non prime number has one of its factor between 1 and root of n
// so unless of running a loop of n run till root n
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
	int n;cin>>n;
	if(isprime(n))cout<<"Prime Number";
	else cout<<"Not a prime number";
	return 0;
}
