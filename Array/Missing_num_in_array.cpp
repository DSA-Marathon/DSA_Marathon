#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        int arr[n-1];
        for (int i = 0; i < n - 1; i++)
        {
            cin >> n;
        }

        int calc = n * (n + 1) / 2;

        for (int i = 0; i < n - 1; i++)
        {
            calc -= arr[i];
        }

        cout << calc;
    }
    cout << endl;

    return 0;
}