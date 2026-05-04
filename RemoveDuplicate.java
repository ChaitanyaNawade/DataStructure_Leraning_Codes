import  java.util.*;

class ArrayOperation 
{
    public int Arr[];

    public ArrayOperation(int Arr[])
    {
        this.Arr = Arr;
    }


    public int findCountDuplicate()
    {
        int n = Arr.length;
        int i = 0;
        int j = 1;

        while(j < n)
        {
            
        }
    }
}

class RemoveDuplicate
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize =  0 , iCnt = 0;

        System.out.println("Enter the size of the array ");

        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements in the array");

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

    }
}