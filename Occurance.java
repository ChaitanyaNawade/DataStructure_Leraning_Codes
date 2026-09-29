import java.util.Scanner;

class ArrayOperation
{
    public int Arr[];

    public ArrayOperation(int arr[])
    {
        this.Arr= arr;
    }

    public int CountOccurance(int target)
    {
        int i = 0 , count = 0;

        for(i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] == target)
            {
                count++;
            }
        }

        return count;
    }
}

class Occurance 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of the array");

        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter elements in an array");

        for(int i = 0 ; i < Arr.length ; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayOperation aobj = new ArrayOperation(Arr);

        System.out.println("Enter the element whose occurance you want to count");

        int Element = sobj.nextInt();

        int iRet = aobj.CountOccurance(Element);

        System.out.println("The elemts occurs "+iRet+" times");

        sobj.close();
    }
}