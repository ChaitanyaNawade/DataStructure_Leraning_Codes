import  java.util.*;

class array
{
    public int Arr[];

    public array(int Arr[])
    {
        this.Arr = Arr;
    }


    public void SecondLargest()
    {
        int iMax = Arr[0],iCnt = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] > iMax)
            {
                iMax = Arr[iCnt];
            }
        }

        int Second = -1;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
              if(Arr[iCnt] < iMax && Arr[iCnt] != iMax)
              {
                Second  = Arr[iCnt];
              }
        }
    }
}

class SecondLargest
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0,iCnt = 0;

        System.out.println("Entr the size of the array");

        int Arr[] = new int[iSize];


        for(iCnt = 0; iCnt < Arr.length ; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

    }
}