import java.util.Scanner;

class ArrayOperation 
{
    public int Arr[];

    public ArrayOperation(int arr[])
    {
        this.Arr = arr;
    }

    public int FirstOccurance(int target)
    {
        int Lo = 0 ;
        int Hi = Arr.length -1;
        int idx1 = -1;
        int  mid = 0;

        while(Lo <= Hi)
        {
            mid = (Lo + Hi)/2;

            if(Arr[mid] > target)
            {
                Hi = mid - 1;
            }
            else if(Arr[mid] < target)
            {
                Lo = mid + 1;
            }
            else 
            {
                idx1 = mid;
                Hi = mid - 1;
            }
        }
        return idx1;
    }


    public int LastOccurance(int target)
    {
        int Lo = 0 ;
        int Hi = Arr.length -1;
        int idx2 = -1;
        int  mid = 0;

        while(Lo <= Hi)
        {
            mid = (Lo + Hi)/2;

            if(Arr[mid] > target)
            {
                Hi = mid - 1;
            }
            else if(Arr[mid] < target)
            {
                Lo = mid + 1;
            }
            else 
            {
                idx2 = mid;
                Lo = mid + 1;
            }
        }
        return idx2;
    }
}

class FirstAndLastOcc 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of the array");

        int iSize = 0 , iCnt = 0 , iRet1 = 0 ,iRet2 = 0;

        iSize = sobj.nextInt();

        System.out.println("Enter the element in an array");

        int Arr[] = new int[iSize];

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Enter the element whose occurance you want to find");

        int Element = sobj.nextInt();

        ArrayOperation aobj = new ArrayOperation(Arr);

        iRet1 = aobj.FirstOccurance(Element);

        iRet2 = aobj.LastOccurance(Element);

        System.out.println("The first occurance of an element is at position : "+iRet1);

        System.out.println("The lst occurance of an element is at position : "+iRet2);
    }
}