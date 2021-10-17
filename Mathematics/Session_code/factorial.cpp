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
int fact(int n){
	if(n==0 || n==1)return 1;
	else return n*fact(n-1);
}

void factorial(int n){
    int arr[2569]={0};
    arr[0]=1;
    int len=1;
    for(int i=2;i<=n;i++){
        int j=0;
        int carry=0;
        while(j<len){
            int x=(arr[j]*i)+carry;
            arr[j]=(x%10);
            carry=(x)/10;
            j++;
        }
        while(carry>0){
            len++;
            int x=(arr[j]+carry);
            arr[j]=x%10;
            carry=x/10;
            j++;
        }
    }
    for(int i=len-1;i>=0;i--){
        cout<<arr[i];
    }
    
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
		cout<<fact(n);
	}while(t--);

	return 0;
}