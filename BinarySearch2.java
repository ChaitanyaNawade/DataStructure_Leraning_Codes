import java.util.Scanner;

class ArrayOperation
{
    public int Arr[];

    public ArrayOperation(int Arr[])
    {
        this.Arr = Arr;
    }

    public Boolean FindElement(int element)
    {
        int Start = 0 , End = Arr.length - 1;

        while(Start <= End)
        {
            int mid = (Start + End) / 2;

            if(Arr[mid] == element)
            {
                return true;
            }
            else if(Arr[mid] > element)
            {
                End = mid - 1;
            }
            else 
            {
                Start = mid + 1;
            }
        }
        return false;
    }
}

class BinarySearch2
{
    public static void main(String A[])
    {
        Scanner sobj  = new Scanner(System.in);

        int Arr[] = new int[5];

        System.out.println("Enter elements in an array");

        int i = 0 ;

        boolean Result = false;

        for(i = 0 ; i < 5 ; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println("enter the element which you want to find in an array");

        int element = sobj.nextInt();
        
        ArrayOperation aobj = new ArrayOperation(Arr);

        Result = aobj.FindElement(element);

        if(Result == false)
        {
            System.out.println("Element is not present in array");
        }
        else 
        {
            System.out.println("Element is present in array");
        }

        sobj.close();
    }
}