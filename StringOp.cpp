#include<iostream>
using namespace std;

class stringOperation
{
    public :

    string str;

    stringOperation(string a)
    {
        str = a;
    }

    void ReverseString()
    {
        int start = 0 , end = str.size() - 1;

        char temp = '\0';

        while(start <= end)
        {
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    void Display()
    {
        cout<<"The string after reversal : "<<str<<endl;
    }
};

int main()
{
    cout<<"Enter the string\n";

    string s;

    getline(cin,s);

    stringOperation sobj(s);

    sobj.ReverseString();

    sobj.Display();

    return 0;
}