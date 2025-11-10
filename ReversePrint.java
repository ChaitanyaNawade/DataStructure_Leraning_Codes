////////////////////////////////////////////////////////////////////////////
//// : Problem:
/////: Given an array, reverse its elements and print the reversed array.
////////////////////////////////////////////////////////////////////////////


import java.util.*;

class ReversePrint 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of the array ");

        int iSize = sobj.nextInt();

        int Arr []= new int[iSize];

        System.out.println("Enter the "+iSize+" Elements in the array");

        int iCnt = 0;

        for(iCnt = 0 ; iCnt < iSize ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("The elements from the array are : ");

        for(iCnt = Arr.length-1 ; iCnt >= 0;iCnt--)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}