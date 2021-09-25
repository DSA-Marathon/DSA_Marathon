#include<bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);

    int test;
    cin >> test;
    while (test--){
        int n, x, p, k, ans=0;
        cin >> n >> x >> p >> k;

        vector<int> a(n+5);
        for (int i=1; i<=n; i++)    
            cin >> a[i];

        sort(a.begin()+1, a.begin()+1+n);

        if (p<k){
            if (x>a[p]) {
                cout << -1 << "\n";
                return;
            }
            while (x<a[p] && p>=1) ans++, p--;
            cout << ans << "\n";
        }
        else if (p>k){
            if (x<a[p]) {
                cout << -1 << "\n";
                return;
            }
            while (x>a[p] && p<=n) 
                ans++, p++;
            cout << ans << "\n";
        }

        else{
            if (a[p]==x) cout << 0 <<"\n";
            else if (a[p]<x){
                while (x>a[p] && p<=n) 
                    ans++, p++;
            cout << ans << "\n";
            }
            else {
                while (x<a[p] && p>=1) 
                    ans++, p--;
                cout << ans << "\n";
            }
        }
    }
    return 0;
}
