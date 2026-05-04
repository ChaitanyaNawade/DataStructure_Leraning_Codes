import java.util.*;

class ArrayOperation
{
    public int Arr[];

    public ArrayOperation(int arr[])
    {
        this.Arr = arr;
    }

    public int BinarySearch(int target)
    {
        int n = Arr.length;

        int i = 0 , j  = n-1 , mid = 0;

        while(i < j)
        {
            mid = (i + j)/2;

            if(Arr[mid] == target)
            {
                return mid;
            }
            else if(Arr[mid] < target)
            {
                j = mid -1;
            }
            else 
            {
                i = mid + 1;
            }
        }

        return -1;
    }
}

class BinarySearchDes
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0 , i =0, iRet = 0;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements in an array");

        for(i = 0 ; i < Arr.length ; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        int target = 0;

        System.out.println("Enter the target which you want to seach in array");

        target = sobj.nextInt();

        ArrayOperation aobj = new ArrayOperation(Arr);
        
        iRet = aobj.BinarySearch(target);

        System.out.println("Element found at index : "+iRet);
    }
}