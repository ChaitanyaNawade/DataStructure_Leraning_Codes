
import java.util.Scanner;
class Array 
{
    public int Arr[];

    public Array(int Arr[])
    {
        this.Arr = Arr;
    }

    public void ReverseArray()
    {
        int iStart = 0, iEnd = Arr.length - 1, Temp = 0;

        while(iStart < iEnd)
        {
            Temp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = Temp;
            iStart++;
            iEnd--;
        }
    }


    public void DisplayArray()
    {
        int iCnt ;
        for(iCnt = 0 ; iCnt < Arr.length; iCnt++)
        {
            System.out.println("\n"+Arr[iCnt]);
        }
    }
}

class ReverseArray2 
{
    public static void main(String A[])
    {

        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array");

        int iSize  = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements in array");

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        Array aobj = new Array(Arr);

        aobj.ReverseArray();

        aobj.DisplayArray();
    }
}