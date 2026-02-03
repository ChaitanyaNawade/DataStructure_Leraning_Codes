#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>

bool CheckNum(int arr[],int iLength,int iNum)
{
        int iCnt = 0;
        bool bFlag = false;

        for(iCnt = 0 ; iCnt < iLength ; iCnt++)
        {
            if(arr[iCnt] == iNum)
            {
                bFlag = true;
                break;
            }
        }

        return bFlag;
}

int main()
{
    int iLength = 0 ,  iCnt = 0 , iNum = 0;

    bool bRet = false;

    printf("Enter the number of elements\n");

    scanf("%d",&iLength);

    int *ptr = NULL;

    ptr =(int *)malloc(iLength * sizeof(int));

    if(ptr == NULL)
    {
        printf("Memory not allocated\n");
        return -1;
    }

    printf("Enter elements in the array\n");

    for(iCnt = 0 ; iCnt < iLength ; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

    printf("Enter the number which you want to find in the array\n");

    scanf("%d",&iNum);

    bRet = CheckNum(ptr,iLength,iNum);

    if(bRet == false)
    {
        printf("The number is not present\n");
    }
    else 
    {
        printf("The number is present\n");
    }

    return 0;
}