////////////////////////////////////////////////////////////////////////////////////////
//// : Problem:
/////: Insert a given element at a specific index in the array and print the new array.
////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class insertElement
{
    public static void main(String A[])
    {
        Scanner sobj   = new Scanner(System.in);

        System.out.println("Enter the size of array ");

        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter "+(iCnt+1)+" Element");

            Arr[iCnt] = sobj.nextInt();
        }

        int Size = Arr.length;

        int newArr[] = new int[Size + 1];
        
        int pos = 2;

        int value = 25;

        System.out.println("Copying elements from the array : ");

        for(iCnt = 0 ; iCnt < newArr.length; iCnt++)
        {
                if(iCnt < pos)
                {
                    newArr[iCnt] = Arr[iCnt]; 
                }
                else if(iCnt == pos)
                {
                    newArr[iCnt] = value;
                }
                else 
                {
                    newArr[iCnt] = Arr[iCnt - 1]; 
                }
        }


        System.out.println("The elements from the array after inserting the element at 2nd index : ");

        for(iCnt = 0 ; iCnt < newArr.length ; iCnt++)
        {
            System.out.println(newArr[iCnt]);
        }
    }
}