#include<iostream>
using namespace std;


void print_pattern(int n){
	char ch=(char)('a'+n-1);
	for(int i=0;i<n;i++){
		// for beginning white spaces
		for(int j=0;j<=(n/2)-i+1;j++){
			cout<<" ";
		}
		for(int j=0;j<=i;j++){
			cout<<((char)(ch-i+j))<<" ";
		}
		cout<<endl;
	}
	cout<<endl;
}
int main(){
	
	int n;cin>>n;
	print_pattern(n);
	return 0;
}