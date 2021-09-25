#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int matrix[n][n];

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> matrix[i][j];
        }
    }

    int upper = 0, lower = 0;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (i <= j)
            {
                upper += matrix[i][j];
            }
            if(j<=i)
            {
                lower += matrix[i][j];
            }
        }
    }

    cout << upper << " " << lower << endl;

    return 0;
}