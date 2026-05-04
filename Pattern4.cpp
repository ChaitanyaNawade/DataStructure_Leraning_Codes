#include<iostream>
using namespace std;

int main()
{
    int i = 0 , j = 0;

    int n = 6;

    for(i = 1 ; i <= n ;i++)
    {
        for(j = 1 ; j <= n ; j++)
        {
            if((i == 1) || (i == n) || (j == 1) || (j == n))
            { 
                cout<<"* ";
            }
            else if((i+j) == (n+1))
            {
                cout<<"* ";
            }
            else 
            {
                cout<<"  ";
            }
        }
        cout<<endl;
    }
    return 0;
}