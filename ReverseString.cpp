#include<iostream>
using namespace std;

class StringOperation 
{
    private :

    string str;

    public :

    StringOperation(string str)
    {
        this->str = str;
    }

    void ReverseString()
    {
        int iStart = 0;
        int iEnd = str.length() - 1;

        char temp = '\0';

        while(iStart < iEnd)
        {
            temp = str[iStart];
            str[iStart] = str[iEnd];
            str[iEnd] = temp;

            iStart++;
            iEnd--;
        }

        cout<<"string after reversal is : "<<str<<endl;
    }
};

int main()
{
    string str;

    cout<<"Enter the string "<<endl;

    getline(cin,str);

    StringOperation sobj(str);

    sobj.ReverseString();

    return 0;
}