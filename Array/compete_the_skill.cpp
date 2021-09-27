#include<iostream>
using namespace std;

void scores(long long a[], long long b[], int &ca, int &cb){
    for(int i=0;i<3;i++){
        if(a[i] > b[i])ca++;
        else if(a[i]<b[i])cb++;
    }  
}


int main(){
	long long  a[3];
	for(int i=0;i<3;i++)cin>>a[i];
	long long b[3];
	for(int i=0;i<3;i++)cin>>b[i];
	int ca=0,cb=0;
	scores(a,b,ca,cb);
	cout<<ca<<" "<<cb<<endl;

	return 0;
}