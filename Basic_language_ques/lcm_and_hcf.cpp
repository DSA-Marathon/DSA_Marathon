#include <iostream>
#include<math.h>
#include<vector>
using namespace std;

long long gcd(long long a,long long b){
      if(b==0)return a;
      else return gcd(b,a%b);
  }

vector<long long> lcmAndGcd(long long a , long long b) {
    long long hf=gcd(max(a,b),min(a,b));
    long long lm=a/hf;
    lm*=b;
    vector<long long> res;
    res.push_back(lm);
    res.push_back(hf);
    return res;
}


int main(){

	long long int a,b;
	cin>>a>>b;
	vector<long long> res=lcmAndGcd(a,b);
	cout<<res[0]<<" "<<res[1]<<endl;
	return 0;
}