#include<iostream>
using namespace std ;

class Demo
{
    private : 
    int *Arr;
    int iSize;

    public :

    Demo(int *Brr, int Size)
    {
        Arr = Brr;
        iSize = Size;
    }

    int FindSecondLargest()
    {
        int iCnt = 0;

        int Max = INT_MIN;
        
        int SecondMax = INT_MIN;
        
        for(iCnt = 0; iCnt < iSize ; iCnt++)
        {
            if(Arr[iCnt] > Max)
            {
                SecondMax = Max;
                Max = Arr[iCnt];
            }
            else if(Arr[iCnt] > SecondMax && Arr[iCnt] < Max)
            {
                SecondMax = Arr[iCnt];
            }
        }

        return SecondMax;
    }

};
int main()
{

    int iSize = 0, iCnt = 0;

    cout<<"Enter the size of the array"<<endl;
     
    cin>>iSize;

    int *Arr = new int[iSize];

    cout<<"Enter the elements in array"<<endl;

    for(iCnt = 0; iCnt < iSize ;iCnt++)
    {
        cin>>Arr[iCnt];
    }
    
    Demo dobj(Arr,iSize);

    int iRet = dobj.FindSecondLargest();

    cout<<"The second Largest element from the array is :"<<iRet<<endl;

    return 0;
}