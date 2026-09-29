#include<stdio.h>
#include<stdlib.h>

void Display(int *ptr,int iSize)
{
    int iCnt = 0;

    for(iCnt = 0 ; iCnt < iSize; iCnt++)
    {
        printf("%d ",ptr[iCnt]);
    }
}

int main()
{
    int iLenght = 0 , i = 0;
    int *ptr = NULL;

    printf("Enter the length of the array\n");

    scanf("%d",&iLenght);

    ptr=(int*)malloc(iLenght*sizeof(int));

    printf("Enter elements in an array\n");

    for(i = 0 ; i < iLenght ;i++)
    {
        scanf("%d",&ptr[i]);
    }

    Display(ptr,iLenght);
    return 0;
}