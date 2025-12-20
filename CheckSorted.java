import java.util.*;

class ArrayX
{
    public int Arr[];

    public ArrayX(int Arr[])
    {
        this.Arr = Arr;
    }


    public boolean CheckSort()
    {
        int i = 0 , j = 0;

        for(i = 0 ;i < Arr.length - 1 ; i++)
        {
            if(Arr[i] > Arr[ i + 1])
            {
                return false;
            }
        }

        return true;
    }
}

class CheckSorted
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0 , iCnt = 0;

        boolean bRet = false;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        for(iCnt = 0 ; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter "+(iCnt + 1)+" Element");
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX(Arr);

        bRet = aobj.CheckSort();


        if(bRet == true)
        {
            System.out.println("The Array is sorted");
        }
        else 
        {
            System.out.println("The array is not sorted");
        }
        
    }
}