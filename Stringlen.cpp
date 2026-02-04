//Write the program to count the length of string 

#include<iostream>

using namespace std;

class StringOperation
{
    private :

    string str;

    public :

    StringOperation(string s)
    {
        str = s;
    }

    int StrLen()
    {
        int iCnt = 0;

        int iCount = 0;

        while(str[iCnt] != '\0')
        {
            if(str[iCnt] != ' ')
            {
                iCount++;
            }
            iCnt++;
        }

        return iCount;
    }
};

int main()
{
    string str;

    int iRet = 0;

    cout<<"Enter the string"<<endl;

    getline(cin,str);

    StringOperation sobj(str);

    iRet = sobj.StrLen();

    cout<<"The length of the string is : "<<iRet;

    return 0;
}