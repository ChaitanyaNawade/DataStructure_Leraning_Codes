// Write a program which accepts a string from the user and counts the number of spaces in the string.

#include<stdio.h>

int CountSpace(char *str)
{
    int iCount = 0;

    while(*str != '\0')
    {
        if(*str == ' ')
        {
            iCount++;
        }

        str++;
    }

    return iCount;
}
int main()
{
    char arr[50];

    int iRet = 0;

    printf("Enter the string\n");

    scanf("%[^'\n']s",&arr);

    iRet = CountSpace(arr);

    printf("The count of the spaces from the string is : %d ",iRet);

    return 0;
}