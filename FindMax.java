////////////////////////////////////////////////////////////////////////////
//// : Problem:
/////: Given an array of integers, find and print the maximum element.
////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayX
{
    public int Arr[];

    public ArrayX(int Arr[])
    {
        this.Arr = Arr;
    }

    public int FindMax()
     { 
       int iMax = Arr[0];

       int iCnt = 0;

       for(iCnt = 0; iCnt < Arr.length;iCnt++)
       {
        if(Arr[iCnt] > iMax)
        {
            iMax = Arr[iCnt];
        }
       }

       return iMax ; 
      }

}

public class FindMax 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");

        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        int iCnt = 0;

        System.out.println("Enter the elements in array ");

        for(iCnt = 0; iCnt < Arr.length ; iCnt++)
        {
            System.out.println("Enter "+(iCnt + 1)+" Element");

            Arr[iCnt] = sobj.nextInt();
        } 


        ArrayX aobj = new ArrayX(Arr);

        int iRet = aobj.FindMax();

        System.out.println("The maximum element from the array is : "+iRet);
    }
}
