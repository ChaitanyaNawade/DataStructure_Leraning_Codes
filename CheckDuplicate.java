import java.util.*;

class ArrayX
{
    public int Arr[];

    public ArrayX(int Arr[])
    {
        this.Arr = Arr;
    }

    public boolean  CheckDuplicate()
    {
        int i = 0 , j = 0;

        for(i = 0 ; i < Arr.length ; i++)
        {
            for(j = i +1 ; j < Arr.length ; j++)
            {
                if(Arr[i] == Arr[j])
                {
                    return true;
                }
            }
        }

        return false;
    }
}

class CheckDuplicate 
{
    public static void main(String A[])
    {
        Scanner sobj =  new Scanner(System.in);

        int iSize = 0, iCnt = 0;

        boolean bRet = false;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        for(iCnt = 0 ;iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX(Arr);

        bRet = aobj.CheckDuplicate();

        if(bRet == true)
        {
            System.out.println("There is duplicate element exist in array");
        }
        else 
        {
            System.out.println("There is no duplicate elements exist in arrray");
        }
    }
}