import java.util.*;

class ArrayX 
{
    public int Arr[];

    public ArrayX(int Arr[])
    {
        this.Arr = Arr;
    }

    public void DisplayOddEven()
    {
        int iCnt = 0;

        System.out.println("Even elements from the array are");
        
        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                System.out.println(Arr[iCnt]);
            }
        }

        System.out.println("Odd elements from the array are");
        
        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] % 2 != 0)
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}

class EvenOdd
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0, iCnt = 0;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter elements in the array");

        for(iCnt = 0 ;iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX(Arr);

        aobj.DisplayOddEven();
    }
}