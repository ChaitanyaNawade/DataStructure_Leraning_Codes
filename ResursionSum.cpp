#include<iostream>
using namespace std;

int CountDigitSum(int n , int Sum)
{
    if(n == 0) return Sum;
    int newSum = Sum + (n % 10);
    return CountDigitSum(n/10 , newSum);
}

int main()
{

    int n = 1234;

    int iRet = CountDigitSum(n,0);
    cout<<iRet<<endl;

    return 0;

}