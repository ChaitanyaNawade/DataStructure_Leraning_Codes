import java.util.*;

class ArrayOperation
{
    public int Arr[];

    public ArrayOperation(int arr[])
    {
        this.Arr = arr;
    }


    public int LastOccurance(int target)
    {
        int n = Arr.length;
        int lo = 0;
        int hi = n - 1;
        int idx = -1;

        while(lo <= hi)
        {
            int mid = (lo + hi) / 2;

            if(Arr[mid] == target)
            {
                idx = mid;
                lo = mid + 1;
            }
            else if(Arr[mid] > target)
            {
                hi = mid - 1;
            }
            else 
            {
                lo = mid + 1;
            }
        }

        return idx;
    }
}

class LastOccurancex
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0 , iRet = 0;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();


        int Arr[] = new int[iSize];

        System.out.println("Enter the elements in an array");

        for(int i = 0  ; i  < Arr.length ; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("Enter the element whose last occurance you want");

        int element = sobj.nextInt();

        ArrayOperation aobj = new ArrayOperation(Arr);

        iRet = aobj.LastOccurance(element);

        System.out.println("The last occurance of the element is at the index "+iRet);

        sobj.close();
    }
}