import java.util.Scanner;

class ArrayX
{
    public int Arr[];

    public ArrayX(int Arr[])
    {
        this.Arr = Arr;
    }

    public void ReverseElements()
    {
        
        int iCnt = 0;

        int temp = 0;
        int iStart = 0;
        int iEnd = Arr.length-1;

        while (iStart < iEnd)
        {
            temp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = temp;

            iStart++;
            iEnd--;
        }

        System.out.println("the elements after reverse are ");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

public class ReverseArray
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of the array ");

        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        int iCnt = 0;

        System.out.println("Enter the elements in array : ");
        
        for(iCnt = 0;iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX(Arr);

        aobj.ReverseElements();
    }
}