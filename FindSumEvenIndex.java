import java.util.*;

class ArrayX
{
    public int Arr[];

    public ArrayX(int Arr[])
    {
        this.Arr = Arr;
    }


    public int FindSumAtEvenIndex()
    {
        int iCnt = 0 , iSum = 0;

        for(iCnt = 0 ;iCnt < Arr.length ; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + Arr[iCnt];
            }
        }

        return iSum;
    }
}

class FindSumEvenIndex 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0 , iCnt = 0 , iRet  = 0;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        for(iCnt = 0 ; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter "+(iCnt + 1)+" Element");
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX(Arr);

        iRet = aobj.FindSumAtEvenIndex();

        System.out.println("The sum of the elements at the even index is :"+iRet);
    }
}