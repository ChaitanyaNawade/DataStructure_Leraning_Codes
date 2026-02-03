#include<iostream>

using namespace std;

class NumberOperation
{
    private :

    int iNum;

    public :

    NumberOperation(int iNum)
    {
        this -> iNum = iNum;
    }

    int FindFactorial()
    {
        int iCnt = 0;

        int iFact = 1;

        for(iCnt = 1 ; iCnt <= iNum; iCnt++)
        {
            iFact = iFact * iCnt;
        }

        return iFact;
    }
};

int main()
{
    int iNum = 0 , iRet = 0;

    cout<<"Enter the number"<<endl;

    cin>>iNum;

    NumberOperation nobj(iNum);

    iRet = nobj.FindFactorial();

    cout<<"The factorial of number is : "<<iRet<<endl;

    return 0;
}