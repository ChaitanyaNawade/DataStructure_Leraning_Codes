#include<iostream>
using namespace std;

int main()
{
    string str = "chaitanya";

    int i = 0 , iCount = 0;

    for(i = 0 ; str[i] != '\0' ; i++)
    {
        iCount++;
    }

    cout<<"The length of string is : "<<iCount;

    return 0;
}