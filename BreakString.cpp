#include<iostream>
#include<vector>
#include<string>
using namespace std;

class stringOperation
{
    public :

    string str;
    string result;
    vector<string> vs;

    stringOperation(string a)
    {
        str = a;
    }

    void BreakString()
    {
    
        int i = 0 ;

        string temp;

        while(str[i] != '\0')
        {
            if(str[i] == ' ')
            {

                int start = 0 , end = temp.size() -1;

                while(start < end)
                {
                    char ch = temp[start];
                    temp[start] = temp[end];
                    temp[end] = ch;
                    start++;
                    end--;
                }

                vs.push_back(temp);
                temp.clear();
            }
            else 
            {
                temp = temp + str[i];
            }
            i++;
        }

         if(!temp.empty())
         {
                int start = 0 , end = temp.size() -1;

                while(start < end)
                {
                    char ch = temp[start];
                    temp[start] = temp[end];
                    temp[end] = ch;
                    start++;
                    end--;
                }

                vs.push_back(temp);
         }
    }


    void converintostring()
    {
        int i = 0 ; 
        for(i = 0 ; i < vs.size() ; i++)
        {
            result = result + vs[i];

            if(i != vs.size() - 1)
            {
                result = result + " ";
            }
        }

        cout<<result;
    }


    // void Display()
    // {
    //     int i = 0;

    //     for(i = 0 ; i < vs.size();i++)
    //     {
    //         cout<<vs[i]<<endl;
    //     }
    // }
};

int main()
{
    cout<<"Enter the string\n";

    string s;

    getline(cin,s);

    stringOperation sobj(s);

    sobj.BreakString();

    sobj.converintostring();

    return 0;
}