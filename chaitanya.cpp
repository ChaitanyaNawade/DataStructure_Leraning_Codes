#include<iostream>
using namespace std;

int main()
{
    int i = 0 , j = 0;

    int n = 5;

    for(i = 1 ; i <= n ;i++)
    {
        for(j = 1 ; j <= i ; j++)
        {
            cout<<i<<" ";
        }
        cout<<endl;
    }
    return 0;
}