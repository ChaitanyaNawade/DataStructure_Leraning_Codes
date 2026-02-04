#include<stdio.h>

int CountSmall(char *str)
{
    int iCount = 0;

    while(*str != '\0')
    {
        if(*str >= 'a' && *str <= 'z')
        {
            iCount++;
        }
        str++;
    }

    return iCount;
}

int main()
{
    char str[50];

    int iRet = 0;

    printf("Enter the string\n");

    scanf("%[^'\n']s",&str);

    iRet = CountSmall(str);

    printf("The count of small character is in string is : %d \n",iRet);

    return 0;
}