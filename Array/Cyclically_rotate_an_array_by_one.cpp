#include <iostream>
using namespace std;

void rotatearray(int arr[], int n)
{
    int l = arr[n - 1];
    for (int i = n - 1; i > 0; i--)
    {
        arr[i] = arr[i - 1];
    }

    arr[0] = l;
}

int main()

{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        int arr[n];
        for (int i = 0; i < n; i++)
        {
            cin >> arr[i];
        }
        rotatearray(arr, n);
        for (int i = 0; i < n; i++)
        {
            cout << arr[i] << " ";
        }
    }
    cout << endl;

    return 0;
}