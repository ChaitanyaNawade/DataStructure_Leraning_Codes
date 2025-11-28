#include<iostream>  
using namespace std; 

class Demo
{
    private :
    int *Arr;
    int Size; 

    public :

    Demo(int *arr,int size)
    {
        this->Arr = arr;
        this->Size = size;
    }

    int FindMinimum()
    {
        int i = 0;
        int Min = Arr[0];

        for(i = 0 ; i < Size ; i++)
        {
            if(Arr[i] < Min)
            {
                Min = Arr[i];
            }
        }
        return Min;
    }
};

int main()
{
    int iSize = 0, iCnt = 0 , iRet = 0;

    cout<<"Enter the size of the array"<<endl;

    cin>>iSize;

    int *Arr = new int[iSize];

    cout<<"Enter elements in the array"<<endl;

    for(iCnt = 0 ; iCnt < iSize ; iCnt++)
    {
        cin>>Arr[iCnt];
    }

    Demo dobj(Arr,iSize);

    iRet = dobj.FindMinimum();

    cout<<"The minimum element from the array is "<<iRet<<endl;
                 
    return 0;
}