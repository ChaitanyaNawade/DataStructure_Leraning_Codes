import java.util.*;

class ArrayX
{
    public int Arr[];


    public ArrayX(int Arr[])
    {
        this.Arr = Arr;
    }

    public void ReverseArray()
    {
        int Brr[] = new int[Arr.length];

        int iSize = Arr.length;

        int iCnt = 0;

        for(iCnt = (Arr.length -1) ; iCnt >= 0 ; iCnt--)
        {
            Brr[iSize - iCnt - 1] = Arr[iCnt];
        }

        System.out.println("Array After reversing");

        for(iCnt =  0 ; iCnt < Brr.length ; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }
}

class ReverseArray1 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of the array");

        int iSize = 0, iCnt = 0;

        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements in array");

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            System.out.println("Enter "+(iCnt + 1)+" Element");

            Arr[iCnt] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX(Arr);

        aobj.ReverseArray();
    }
}