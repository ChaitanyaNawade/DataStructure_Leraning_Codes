#include<stdio.h>

int CountLetter(char *ptr , char ch)
{
    int iCount = 0;

    while(*ptr != '\0')
    {
        if(*ptr >= 'A' && *ptr <= 'Z')
        {
            if(*ptr == ch || *ptr == (ch + 32))
            {
                iCount++;
            }
        }
        else if(*ptr >= 'a' && *ptr <= 'z')
        {
            if(*ptr == ch || *ptr == (ch - 32))
            {
                iCount++;
            }
        }
        else 
        {
            if(*ptr == ch)
            {
                iCount++;
            }
        }
        ptr++;
    }

    return iCount;
}
int main()
{
    char Arr[50] = {'\0'};

    char ch = '\0';
    int iRet = 0;

    printf("Enter the string \n");

    scanf("%[^'\n]",&Arr);

    printf("Enter the character whose frequency you want to check \n");

    scanf(" %c",&ch);

    iRet = CountLetter(Arr,ch);

    printf("The frequency of character in string is : %d",iRet);

    return 0;
}