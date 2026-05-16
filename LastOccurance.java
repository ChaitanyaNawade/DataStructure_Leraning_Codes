import java.util.Scanner;

class ArrayOperation
{
    public int Arr[];

    public ArrayOperation(int Arr[])
    {
        this.Arr = Arr;
    }

    public int FirstOccurance(int target)
    {
        int Low = 0;
        int High = Arr.length - 1;
        int mid = 0;
        int idx = -1;

        while(Low <= High)
        {
            mid = (Low + High)/2;

            if(Arr[mid] == target)
            {
                idx = mid;
                Low = mid +1;
            }
            else if(Arr[mid] > target)
            {
                High = mid - 1;
            }
            else 
            {
                Low = mid + 1;
            }
        }

        return idx;
    }
}

class LastOccurance
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0 , iRet = 0;

        System.out.println("Enter the size of the arraay");

        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements in an array");

        for(iCnt = 0 ; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the element which you want to find");

        int Element = sobj.nextInt();

        ArrayOperation aobj = new ArrayOperation(Arr);

        iRet = aobj.FirstOccurance(Element);

        if(iRet != -1)
        {
            System.out.println("Element is found at first on this position :"+iRet);
        }
        else 
        {
            System.out.println("Element is not present in an array");
        }
        
    }  
}