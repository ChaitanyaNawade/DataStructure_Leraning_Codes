#include<iostream>
using namespace std;

class Demo 
{
    private:
    int iCnt;

    public :

    Demo(int n)
    {
        iCnt = n;
    }

    void PrintTable()
    {
        int i = 0, iMult = 0;

        for(i = 1 ; i <= 10 ; i++,iMult++)
        {
            iMult = iCnt * i;
            cout<<iMult<<endl;
        }
    }
    
};

int main()
{
    int Num = 0;

    cout<<"Enter the number whose table you want to print"<<endl;

    cin>>Num;

    Demo dobj(Num);

    dobj.PrintTable();

    return 0;
}