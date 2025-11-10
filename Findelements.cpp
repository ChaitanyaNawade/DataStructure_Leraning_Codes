#include<iostream>
using namespace std;

class Demo 
{
    private :

    int *Arr;
    int iSize;
     

    public :
    Demo(int A[],int Size)
    {
        Arr = A;
        iSize = Size;
    }

    int CountElements()
    {
        int iDigit = 0 ;

        int iCnt = 0 ;
        for(iCnt = 0 ; iCnt < iSize ; iCnt++)
        {
            iDigit++;
        }
        return iDigit;
    }
};

int main()
{
    cout<<"Enter the size of array : "<<endl;
    int iSize = 0 , iRet = 0;

    cin>>iSize;

    int *Arr = new int[iSize];

    cout<<"Enter the elements in the array : "<<endl;

    int iCnt = 0;

    for(iCnt = 0 ; iCnt < iSize ; iCnt++)
    {
        cin>>Arr[iCnt];
    }

    Demo dobj(Arr,iSize);

    cout<<"The total number of elements from the array are "<<dobj.CountElements()<<endl;

    return 0;
}