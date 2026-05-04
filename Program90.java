import java.util.Scanner;

class ArrayOperation
{
    public int Arr[];
    public int Brr[];
    public int Crr[];

    public ArrayOperation(int Arr[],int Brr[])
    {
        this.Arr = Arr;
        this.Brr = Brr;
        this.Crr = new int[Arr.length + Brr.length];
    }

    public void MergeSortArray()
    {
        int n = Arr.length;
        int m = Brr.length;

        int i = 0;
        int j = 0;
        int pos = 0;

        while(i < n && j < m)
        {
            if(Arr[i] <= Brr[j])
            {
                Crr[pos] = Arr[i];
                pos++;
                i++;
            }
            else 
            {
                Crr[pos] = Brr[j];
                pos++;
                j++;
            }
        }

        while(i < n)
        {
            Crr[pos] = Arr[i];
            pos++;
            i++;
        }

        while(j < m)
        {
            Crr[pos] = Brr[j];
            pos++;
            j++;
        }
    }

    public void Display()
    {
        int i  = 0 ;

        for(i = 0 ; i < Crr.length ; i++)
        {
            System.out.print(Crr[i]+" ");
        }
    }
}

class Program90
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0 , iCnt = 0 ,iSize1 = 0;

        System.out.println("Enter the size of the first array");

        iSize = sobj.nextInt();

        System.out.println("Enter the size of the second array");

        iSize1 = sobj.nextInt();

        int Arr[] = new int[iSize];

        int Brr[] = new int[iSize1];

        System.out.println("Enter the elements in first array");

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the elements in second array");

        for(iCnt = 0 ; iCnt < Brr.length ; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        ArrayOperation aobj = new ArrayOperation(Arr, Brr);

        aobj.MergeSortArray();

        aobj.Display();

        sobj.close();
    }
}