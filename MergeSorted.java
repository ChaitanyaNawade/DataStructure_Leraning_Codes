
import java.util.Scanner;

class ArrayOperation
{
    public int Arr[];
    public int Brr[];

    public ArrayOperation(int Arr[],int Brr[])
    {
        this.Arr = Arr;
        this.Brr = Brr;
    }

    public void MergeSortArray()
    {
        int m = Arr.length;
        int n = Brr.length;
        int pos = 0,iCnt  = 0;

        int Res[] = new int[m + n];
        
        int i =0;
        int j = 0;

        while(i < m &&  j < n)
        {
             if(Arr[i] < Brr[j])
             {
                Res[pos] = Arr[i];
                i++;
                pos++;
             }
             else 
             {
                Res[pos] = Brr[j];
                j++;
                pos++;
             }
        }

        while(i < m)
        {
            Res[pos] = Arr[i];
            i++;
            pos++;
        }

        while(j < n)
        {
            Res[pos] = Brr[j];
            j++;
            pos++;
        }

        for(iCnt = 0 ;  iCnt < Res.length; iCnt++)
        {
                System.out.print(" "+Res[iCnt]);
        }

    }
}

class MergeSorted
{
    public static void  main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize1 = 0, iSize2 = 0 , iCnt  = 0;
         
        System.out.println("Enter the size of the first array");

        iSize1 = sobj.nextInt();

        int Arr[] = new int[iSize1];

        System.out.println("Enter the size of the second array");

        iSize2 = sobj.nextInt();

        int Brr[] = new int[iSize2];

        System.out.println("Enter the elements in the first array");

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the elements of the second array");

        for(iCnt  = 0 ; iCnt < Brr.length ; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        ArrayOperation aobj = new ArrayOperation(Arr,Brr);

        aobj.MergeSortArray();
    }
}