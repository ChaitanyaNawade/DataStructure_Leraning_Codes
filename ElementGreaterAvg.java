
import java.util.Scanner;

class ArrayOperation
{
    public int Arr[];


    public ArrayOperation(int Arr[])
    {
        this.Arr = Arr;
    }

    public void FindLargestAvg()
    {
        int iSum = 0 ; 
        int Count = 0;
        float Avg = 0.0f;


        for(int iCnt = 0; iCnt < Arr.length ; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }

        Avg = (float)iSum /Arr.length;

        for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] > Avg)
            {
                Count++;
            }
        }

        System.out.println("The count of the : "+Count);
    }
}

class ElementGreaterAvg
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0, iCnt = 0;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();

        int Arr[]= new int[iSize];

        System.out.println("Enter the elements in the array");
        
        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayOperation aobj = new ArrayOperation(Arr);

        aobj.FindLargestAvg();

        sobj.close();
    }
}