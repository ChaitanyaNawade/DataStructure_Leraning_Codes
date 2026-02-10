import java.util.Scanner;

class NumberX
{
    public int Arr[];

    public NumberX(int iSize)
    {
        this.Arr= new int[iSize];
    }

    public int CountEven()
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class CountEven
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0 , iCnt = 0;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();

        NumberX nobj = new NumberX(iSize);

        System.out.println("Enter elements in the array");

        for(iCnt = 0 ; iCnt < nobj.Arr.length ; iCnt++)
        {
            nobj.Arr[iCnt] = sobj.nextInt();
        }

        System.out.println();

        System.out.println("Elements from the array are");

        for(iCnt = 0 ; iCnt < nobj.Arr.length ; iCnt++)
        {
            System.out.print(" "+nobj.Arr[iCnt]);
        }

        System.out.println();


        int iRet = nobj.CountEven();

        System.out.println("The number of even elements from the array are : "+iRet);

        sobj.close();
    }
}