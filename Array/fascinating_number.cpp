#include<bits/stdc++.h>
using namespace std;


/* ***************************************************** */

bool fascinating(int n){
	string st=to_string(n)+to_string(n*2)+to_string(n*3);
	int arr[10]={0};
	for(int i=0;i<st.length();i++){
		arr[st[i]-'0']++;
	}
	
	for(int i=1;i<10;i++){
		if (arr[i] != 1) return false;
	}
	return true;
}

int main(){

	int n;cin>>n;
	if(fascinating(n))cout<<"Fascinating";
	else cout<<"Not Fascinating";


	return 0;
}