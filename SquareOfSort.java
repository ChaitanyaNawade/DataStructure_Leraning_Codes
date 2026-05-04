
import java.util.Scanner;

class ArrayOperation
{
    public int Arr[];

    public ArrayOperation(int Arr[ ])
    {
        this.Arr = Arr;
    }

    public int[] SquareSortArray()
    {
        int Res[] = new int[Arr.length];
        
        int pos = 0, iCnt = 0;

        for(iCnt = 0 ; iCnt < Arr.length; iCnt++)
        {
            Res[pos] = Arr[iCnt] * Arr[iCnt];

            pos++;
        }

        int i = 0;
        int j = 1;
        int temp  = 0;

        while(i < j)
        {
            if(Res[i] > Res[j])
            {
                temp  = Res[i];
                Res[i] = Res[j];
                Res[j] = temp;
                i++;
                j++;
            }
        }
        return Res;
    }
}

class SquareOfSort
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0, iCnt = 0;

        int [] iRet;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();

        int Arr[]  = new int[iSize];

        System.out.println("Enter the elements in the array");

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayOperation aobj = new ArrayOperation(Arr);

        iRet = aobj.SquareSortArray();

        System.out.print("The square of the sorted array is : "+iRet);
        
    }
}