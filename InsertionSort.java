import java.util.Scanner;
class ArrayOperation 
{
    public int Arr[];

    public ArrayOperation(int Arr[])
    {
        this.Arr = Arr;
    }

    public void InsertionSort()
    {
        int i = 0 ,j = 0 , temp = 0;

        for(i = 1 ; i < Arr.length ;i++)
        {
            j  = i;

            while(j > 0 && Arr[j] < Arr[j-1])
            {
                temp = Arr[j];
                Arr[j] = Arr[j-1];
                Arr[j-1] = temp;
                j--;
            }
        }
    }

    public void Display()
    {
        int i = 0;

        for(i = 0 ;  i < Arr.length ; i++)
        {
            System.out.print(Arr[i]+" ");
        }
    }
}

class InsertionSort
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0 , iCnt = 0;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter elements in an array");

        for(iCnt = 0 ; iCnt < Arr.length ;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayOperation aobj = new ArrayOperation(Arr);

        aobj.InsertionSort();

        aobj.Display();

        sobj.close();
    }
}