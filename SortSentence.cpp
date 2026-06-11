/*
myself2 and3 me1 i4
*/

#include<iostream>
#include<vector>
#include<string>

using namespace std;

class StringOperation
{
    public :

    string s;
    vector<string> ans;
    string temp;
    string result;
    int index = 0 , count = 0;

    StringOperation(string a)
    {
        s = a;
        ans.resize(10);
    }

    void SortString()
    {
        while(index < s.size())
        {
            if(s[index] == ' ')
            {
                int pos = temp[temp.size() - 1] - '0';
                temp.pop_back();
                ans[pos - 1] = temp;
                temp.clear();
                count++;
            }
            else 
            {
                temp += s[index];
            }
            index++;
        }

        if(!temp.empty())
        {
            int pos = temp[temp.size() - 1] - '0';
            temp.pop_back();
            ans[pos - 1] = temp;
        }
    }

        void ConvertString()
        {
            for(int i = 0 ; i <= count ; i++)
            {
                result = result + ans[i];
                result.push_back(' '); 
            }

            result.pop_back();
        }

        void Display()
        {
            cout<<"The string after reversal is : "<<result<<endl;
        }
};

int main()
{
    cout<<"Enter the string\n";

    string str;

    getline(cin,str);

    StringOperation sobj(str);

    sobj.SortString();

    sobj.ConvertString();

    sobj.Display();
    
    return 0;
}