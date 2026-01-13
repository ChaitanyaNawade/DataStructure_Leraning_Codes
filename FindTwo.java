import  java.util.*;

class ArrayOperation
{
    public int Arr[];


    public ArrayOperation(int Arr[])
    {
        this.Arr = Arr;
    }

    public void FindTwo(int Target)
    {
        Arrays.sort(Arr);

        int n = Arr.length;

        int Start = 0;
        int End  = n - 1;
       

        while(Start < End)
        {
            int iSum = Arr[Start] + Arr[End];

            if(iSum == Target)
            {
                System.out.println("Pair Found "+Arr[Start]+" "+Arr[End]+" ");
                return;
            }
            if(iSum < Target)
            {
                Start++;
            }
            else if(iSum > Target)
            {
                End--;
            }
        }
        System.out.println("no pair found");
    }
}

class FindTwo 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0 , iCnt = 0 , Target = 9;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements in the array");

        for(iCnt = 0 ; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        ArrayOperation aobj = new ArrayOperation(Arr);

        aobj.FindTwo(Target);

    }
}