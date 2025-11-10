#include<iostream>
using namespace std;

 int CountOccurance(int *Arr, int iSize)
{
    int iCnt = 0;

    cout<<"Enter the elements whose occurance you want to find"<<endl;

    int Element = 0;

    cin>>Element;

    int iCount = 0;

    for(iCnt = 0 ; iCnt < iSize; iCnt++)
    {
        if(Arr[iCnt]== Element)
        {
            iCount++;
        }
    }

    return iCount;
}
int main()
{
    int iSize = 0, i = 0,iRet = 0;

    cout<<"Enter the size of array"<<endl;

    cin>>iSize;

    int *Arr = new int[iSize];

    cout<<"Enter the elements in array"<<endl;

    for(i = 0; i < iSize; i++)
    {
        cin>>Arr[i];
    }

    iRet = CountOccurance(Arr,iSize);

    cout<<"The total occurance of the element is : "<<iRet<<endl;
}