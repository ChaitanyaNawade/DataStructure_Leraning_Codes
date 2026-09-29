#include<iostream>
using namespace std;

template <class T>
T Addition(T No1 , T No2)
{
    T Ans ;
    Ans = No1 + No2;
    return Ans;
}

int main()
{
    float iRet , Val1 , Val2;

    cout<<"Enter first number"<<endl;

    cin>>Val1;

    cout<<"Enter second number"<<endl;

    cin>>Val2;

    iRet = Addition(Val1,Val2);

    cout<<"Addition is : "<<iRet;

    return 0;
}