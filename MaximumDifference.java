class ArrayOperation
{
    public int Arr[];

    public ArrayOperation(int Arr[])
    {
        this.Arr = Arr;
    }

    public int CountDifference()
    {
        int iMax = 0;
        int iMin = Integer.MAX_VALUE;

        int i = 0 , MaxDifference = 0;

        for(i = 0  ; i < Arr.length ; i++)
        {
            if(Arr[i] > iMax)
            {
                iMax = Arr[i];
            }
            else if(Arr[i] < iMin)
            {
                iMin = Arr[i];
            }
        }

        MaxDifference = iMax - iMin;

        return MaxDifference;
    }
}

class MaximumDifference
{
    public static void main(String A[])
    {
        int Arr[] = {10,-2,8,15};

        int iRet = 0;

        ArrayOperation aobj = new ArrayOperation(Arr);

        iRet = aobj.CountDifference();

        System.out.println("The maximum difference is : "+iRet);
    }
}