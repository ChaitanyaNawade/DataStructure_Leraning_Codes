
import java.util.Scanner;

class ArrayOperations 
{
    public int Arr[];

    public ArrayOperations(int Arr[])
    {
        this.Arr = Arr;
    }

    public int FindSecondSmallest()
    {
        int iSmall = Integer.MAX_VALUE , SCSmall = Integer.MAX_VALUE , iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] < iSmall)
            {
                SCSmall = iSmall;
                iSmall = Arr[iCnt];
            }
            else if(Arr[iCnt]> iSmall && Arr[iCnt] < SCSmall)
            {
                SCSmall = Arr[iCnt];
            }
        }

        return SCSmall;
    }
}

class SecondSmallest 
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

        iRet = aobj.FindSecondSmallest();

        System.out.println("The Second Smallest element from the array is :"+iRet);

        sobj.close();
    }
}