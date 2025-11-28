#include<iostream>
using namespace std;

class Demo 
{
    private :
    int *Arr;
    int Size;

    public:

    Demo(int arr[], int size)
    {
        this-> Arr = arr;
        this-> Size = size;
    }

    
    void Sort()
    {
        int i ,j,Temp ;

        for(i = 0 ; i < Size; i++)
        {
            for(j = 0; j < Size - 1 - i; j++)
            {
                if(Arr[j] > Arr[j+1])
                {
                    Temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = Temp;
                }
            }
        }
    }
         

    void Display()
    {
        for(int i = 0 ; i < Size ; i++)
        {
            cout<<Arr[i]<<" ";
        }
    }

    
};

int main()
{
   int iSize = 0; 
   int iCnt = 0;

   cout<<"Enter the size of the array "<<endl;

   cin>>iSize;

   int *Arr = new int[iSize];

   cout<<"Enter the elements in the array"<<endl;

    for(iCnt = 0 ; iCnt <iSize ; iCnt++)
    {
        cout<<"Enter "<<(iCnt + 1)<<"Element"<<endl;

        cin>>Arr[iCnt];
    }

    Demo dobj(Arr,iSize);

    dobj.Sort();

    dobj.Display();

}