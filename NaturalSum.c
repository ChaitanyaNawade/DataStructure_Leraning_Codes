#include<stdio.h>

int NaturalSum(int Num)
{
    int iCnt = 0;

    int Sum = 0;

    for(iCnt = 1; iCnt <= Num; iCnt++)
    {
        Sum = Sum + iCnt;
    }
    return Sum;
}

int main()
{
    int N = 0,iRet = 0;

    printf("Enter the Number till which you want to count the addition\n");

    scanf("%d",&N);

    iRet = NaturalSum(N);

    printf("The addition of the naturals numbers till %d is %d",N,iRet);

    return 0;
}