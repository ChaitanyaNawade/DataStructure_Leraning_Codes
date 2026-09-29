#include<stdio.h>

int CountLength(char *ptr)
{
    int iCount = 0;

    for(; *ptr != '\0';ptr++)
    {
        iCount++;
    }

    return iCount;
}

int main()
{
    char Arr[50];

    int iRet = 0;

    printf("Enter you name :\n");

    scanf("%[^\n]",&Arr);

    iRet = CountLength(Arr);

    printf("The length of the string is : %d",iRet);

    return 0;
}