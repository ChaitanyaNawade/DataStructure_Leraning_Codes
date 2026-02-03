#include<iostream>
using namespace std;

class NumberOperation
{
    private :

    int Num;

    public :

    NumberOperation(int num)
    {
        this -> Num = num;
    }


    int CheckLargest()
    {
        int temp = Num;

        int Max = 0 , iDigit = 0;

        if(Num < 0)
        {
        Num = -Num;
        }
        
        while(temp > 0)
        {
            iDigit = temp % 10;

            if(iDigit > Max)
            {
                Max = iDigit;
            }

            temp = temp / 10;
        }

        return Max;
    }
};

int main()
{
    int iNum = 0;

    int iRet = 0;

    cout<<"Enter the number which you want to check it is palidrome or not"<<endl;

    cin>>iNum;

    NumberOperation nobj(iNum);

    iRet = nobj.CheckLargest();

    cout<<"The largest Digit from number is : "<<iRet<<endl;
    
    return 0;
}