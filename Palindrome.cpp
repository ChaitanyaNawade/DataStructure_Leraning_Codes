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

    bool CheckPalindrome()
    {
        int temp = Num;

        int RevNum = 0 , iDigit = 0;

        bool Flag  = false;

        while(temp > 0)
        {
            iDigit = temp % 10;

            RevNum = RevNum * 10 + iDigit;

            temp = temp / 10;
        }

        if(RevNum == Num)
        {
            Flag = true;
            
        }
        else 
        {
            Flag = false;
        }

        return Flag;
    }
};

int main()
{
    int iNum = 0;

    bool bRet = false;

    cout<<"Enter the number which you want to check it is palidrome or not"<<endl;

    cin>>iNum;

    NumberOperation nobj(iNum);

    bRet = nobj.CheckPalindrome();

    if(bRet == true)
    {
        cout<<"Number is palindrome"<<endl;
    }
    else 
    {
        cout<<"Number is not palindrome"<<endl;
    }

    return 0;
}