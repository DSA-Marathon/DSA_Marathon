#include<iostream>
using namespace std;

bool ispalindrome(int num){
	int original_num=num;
	int rev=0;
	while(num){
		rev=(rev*10)+(num%10);
		num/=10;
	}
	if(rev==original_num)return true;
	return false;
}

int main(){
	#ifndef ONLINE_JUDGE
        freopen("input.txt", "r", stdin);
        freopen("output.txt", "w", stdout);
    #endif // ONLINE_JUDGE

    int num=0;
    cin>>num;
    if(ispalindrome(num))cout<<"palindrome";
    else cout<<"not a palindrome";
    cout<<endl;
	return 0;
}