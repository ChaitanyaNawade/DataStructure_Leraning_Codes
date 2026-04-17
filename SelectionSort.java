import java.util.Scanner;

class ArrayOperation
{
    public int Arr[];

    public ArrayOperation(int Arr[])
    {
        this.Arr = Arr;
    }

    public void SelectionSort()
    {
        int i = 0 , j = 0 ,temp = 0;
        int n = Arr.length;

        for(i = 0 ; i < n - 1; i++)
        {
            int min = Integer.MAX_VALUE;
            int idx = -1;

            for(j = i ; j < n ;j++)
            {
                if(Arr[j] < min)
                {
                    min = Arr[j];
                    idx = j;
                }
            }

                temp = Arr[i];
                Arr[i] = Arr[idx];
                Arr[idx] = temp;
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

class SelectionSort 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0 , i = 0;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements in an array");

        for(i = 0 ; i < Arr.length;i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayOperation aobj =  new ArrayOperation(Arr);

        aobj.SelectionSort();
        aobj.Display();
        sobj.close();
    }
}