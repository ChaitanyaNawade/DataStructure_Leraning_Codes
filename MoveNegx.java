    import java.util.Scanner;

class ArrayOperation
{
    public int Arr[];

    public ArrayOperation(int Arr[])
    {
        this.Arr = Arr;
    }

    public void BubbleSort()
    {
        int i = 0 , n = Arr.length,j = n-1,temp = 0;

        

        while(i < j)
        {
            if(Arr[i] < 0)
            {
                i++;
            }
            else if(Arr[j] >= 0)
            {
                j--;
            }
            else 
            {
            temp = Arr[i];
            Arr[i] = Arr[j];
            Arr[j] = temp;
            i++;
            j--;
            }
        }
    }

    public void Display()
    {
        int i = 0;

        for(i = 0 ; i < Arr.length; i++)
        {
            System.out.print(Arr[i]+" ");
        }
    }
}

class MoveNegx 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0 , i = 0;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements in an array");

        for(i = 0  ; i < Arr.length ;i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ArrayOperation aobj = new ArrayOperation(Arr);

        aobj.BubbleSort();

        aobj.Display();

        sobj.close();

    }
}