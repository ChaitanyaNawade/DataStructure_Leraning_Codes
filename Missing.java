import java.util.Scanner;

class ArrayOperation
{
    public int Arr[];
    public int n;

    public ArrayOperation(int Arr[], int n)
    {
        this.Arr = Arr;

        this.n = n;
    }

    public int FindMissing()
    {
        int Total = n * (n + 1) / 2;

        int sum = 0;

        for(int i = 0 ; i < Arr.length ; i++)
        {
            sum = sum + Arr[i];
        }

        return  Total - sum;
    }
}

class Missing
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements in array");

        int i = 0;

        for(i = 0  ; i < Arr.length ; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        int n  = Arr.length +1;

        ArrayOperation aobj = new ArrayOperation(Arr, n);

        int iRet = 0;

        iRet = aobj.FindMissing();

        System.out.println("The missing number from the array is : "+iRet);
        
    }
}