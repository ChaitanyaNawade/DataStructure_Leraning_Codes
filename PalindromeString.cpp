#include<iostream>
using namespace std;

class StringOperation
{
    public :

    string str;

    StringOperation(string a)
    {
        str = a;
    }

    bool checkPalindrome()
    {
        int start = 0 , end = str.size()-1;

        while(start <= end)
        {
            if(str[start] != str[end])
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
};

int main()
{
    cout<<"Enter the string"<<endl;

    string s;

    getline(cin,s);

    bool bRet = false;

    StringOperation sobj(s);

    bRet = sobj.checkPalindrome();

    if(bRet == false)
    {
        cout<<"The string is not an palindrome\n";
    }
    else 
    {
        cout<<"The string is a palindrome\n";
    }

    return  0;
}