import java.util.Scanner;

class ArrayOperation
{
    public int Arr[];

    public ArrayOperation(int Arr[])
    {
        this.Arr = Arr;
    }


    public boolean LinearSearch(int element)
    {

        int iCnt = 0;
        boolean bFlag = false;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] == element)
            {
                bFlag = true;
                break;
            }
        }
        return bFlag;
    }
}

class LinearSearch
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0 , iCnt = 0,Element = 0;

        boolean bRet = false;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements in an array");

        for(iCnt = 0 ; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the element which you want to check");

        Element = sobj.nextInt();

        ArrayOperation aobj = new ArrayOperation(Arr);

        bRet = aobj.LinearSearch(Element);

        if(bRet ==  true)
        {
            System.out.println("Element is found in the array");
        }
        else 
        {
            System.out.println("Element not present in the array");
        }

    }
}