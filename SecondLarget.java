////////////////////////////////////////////////////////////////////
//
//
//
//Find the second Largest element from array 
//
//
//
/////////////////////////////////////////////////////////////////////

import java.util.*;


class Demo 
{
    public int Arr[];


    public Demo(int Arr[])
    {
        this.Arr= Arr;
    }


    public int SecondLarget()
    {
        int iCnt = 0;

        int iMax = Arr[0];

        for(iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            if(Arr[iCnt] > iMax)
            {
                iMax = Arr[iCnt];
            }
        }


        int SecondLargest = -1;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] > SecondLargest && Arr[iCnt] != iMax)
            {
                SecondLargest  = Arr[iCnt];
            }
        }
       

        return SecondLargest;
    }
}
class SecondLarget
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array ");

        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements in array ");

        int iCnt = 0;

        for(iCnt = 0 ; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        Demo dobj = new Demo(Arr);

        int iRet = 0;

        iRet = dobj.SecondLarget();

        System.out.println("The Secondlargest element is : "+iRet);
    }
}