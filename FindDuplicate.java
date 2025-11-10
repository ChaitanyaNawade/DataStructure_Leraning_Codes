import java.util.*;

class ArrayX
{
    public int Arr[];

    public ArrayX(int Arr[])
    {
        this.Arr = Arr;
    }

    public int FindDuplicate()
    {
        int Duplicate = Arr[0];
        int iCnt = 0 , j = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            for(j = iCnt + 1; j < Arr.length; j++)
            {
                if(Arr[iCnt] == Arr[j])
                {
                    return Arr[iCnt];
                }
            }
        }   
        return -1;
    }
}
class FindDuplicate 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array "); 

        int iSize  = sobj.nextInt();

        int iCnt = 0;

        int iRet = 0;

        int Arr[] = new int [iSize];

        System.out.println("Enter the elements in array");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter "+(iCnt+1)+" Element");
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX(Arr);

        iRet =  aobj.FindDuplicate();

        if(iRet == -1)
        {
            System.out.println("The duplicate is not found : ");
        }
        else 
        {
            System.out.println("The Duplicate element from the array is : "+iRet);
        }   
    }
}