#include<iostream>
using namespace std;

int power(int x,int n){
    int res=1;
    while(n){
        if(n%2==0){
            x*=x;n/=2;
        }
        else{
            res*=x;n--;
        }
    }
    return res;
}
int main(){
    #ifndef ONLINE_JUDGE
        freopen("input.txt", "r", stdin);
        freopen("output.txt", "w", stdout);
    #endif // ONLINE_JUDGE

    int x,n;cin>>x>>n;
    cout<<power(x,n);

	return 0;
}