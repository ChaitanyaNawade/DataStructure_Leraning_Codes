#include<iostream>

using namespace std;

int FindSum(int Arr[],int Size)
{
    int iSum = 0, i = 0;

    for(i = 0 ; i <Size; i++)
    {
        iSum = iSum + Arr[i];
    }

    return iSum;
}

int main()
{
    cout<<"Enter the size of array "<<endl;

    int iSize = 0;

    cin>>iSize;

    int *Arr =new int[iSize];

    cout<<"Enter the elements in the array "<<endl;

    int i = 0;

    for(i = 0 ; i <iSize; i++)
    {
        cin>>Arr[i];
    }

    int iRet = FindSum(Arr,iSize);

    cout<<"The addition of the elements of the array is : "<<iRet;

    delete Arr;

    return 0;
}
