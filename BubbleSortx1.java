import java.util.Scanner;

class ArrayOperation
{
    int Arr[];

    public ArrayOperation(int Arr[])
    {
        this.Arr  = Arr;
    }

    public void SquareOfArray()
    {
        int i = 0;

        int n = Arr.length;

        for(i = 0 ; i < n ; i++)
        {
            Arr[i] = Arr[i] * Arr[i];
        }
    }

    public void BubbleSort()
    {
        int i = 0 , j = 0;

        int n = Arr.length;

        for(i = 0 ; i < n ; i++)
        {
            for(j = 0 ; j < n - 1 - i; j++)
            {
                if(Arr[j] > Arr[j+1])
                {
                    int temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                }
            }
        }
    }

    public void Display()
    {
        int i = 0;

        for(i = 0 ; i < Arr.length ; i++)
        {
            System.out.print(Arr[i]+" ");
        }
    }
}

class BubbleSortx1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of the array");

        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements in an array");

        for(int i = 0; i < Arr.length ; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    
        ArrayOperation aobj = new ArrayOperation(Arr);

        aobj.SquareOfArray();

        aobj.BubbleSort();

        aobj.Display();

        sobj.close();
        
    }
}