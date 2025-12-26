
import java.util.Scanner;

class ArrayOperations 
{
    public int Arr[];

    public ArrayOperations(int Arr[])
    {
        this.Arr = Arr;
    }

    public int FindSmallest()
    {
        int iSmall = Arr[0], iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] < iSmall)
            {
                iSmall = Arr[iCnt];
            }
        }

        return iSmall;
    }
}

class Smallest 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0, iCnt = 0 , iRet = 0;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements in the arry");

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayOperations aobj = new ArrayOperations(Arr);

        iRet = aobj.FindSmallest();

        System.out.println("The Smallest element from the array is :"+iRet);

        sobj.close();
    }
}