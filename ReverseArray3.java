
import java.util.Scanner;


class ArrayOperations 
{
    public int Arr[];

    public ArrayOperations (int Arr[])
    { 
        this.Arr = Arr;
    }

    // Reverse the array in-place using index swapping
    public void ReverseArray()
    {
        int iCnt = 0 , Temp = 0 , n = Arr.length;

        for(iCnt = 0 ;iCnt < Arr.length / 2 ; iCnt++)
        {
            Temp = Arr[iCnt];
            Arr[iCnt] = Arr[n - iCnt - 1];
            Arr[n - iCnt - 1] = Temp;
        }
    }


    public void DisplayArray()
    {
        int iCnt = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}




class ReverseArray3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0, iCnt = 0;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements in array");

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayOperations aobj = new ArrayOperations(Arr);

        aobj.ReverseArray();

        aobj.DisplayArray();

        sobj.close();
    }
}