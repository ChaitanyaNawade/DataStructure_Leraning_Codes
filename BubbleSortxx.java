import java.util.Scanner;

class ArrayOperation 
{
    public int Arr[];

    public ArrayOperation(int Arr[]) {
        this.Arr = Arr;
    }

    public void BubbleSort() 
    {
        int i = 0, j = 0, n = Arr.length, temp = 0;

        for(i = 0 ; i < n ; i++)
        {
            boolean isSorted = true;

            for(j = 0 ; j < n - 1; j++)
            {
                if(Arr[j] > Arr[j+1])
                {
                    isSorted = false;
                    break;
                }
            }

            if(isSorted == true)
            {
                break;
            }

            for(j = 0; j < n - i - 1;j++)
            {
                if(Arr[j] > Arr[j+1])
                {
                    temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                }
            }
        }

        
    }

    public void Display() 
    {
        int i = 0;

        for (i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
    }
}

class BubbleSortxx 
{
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        int iSize = 0, i = 0;

        System.out.println("Enter the size of the array");

        iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements in an array");

        for (i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();
        }

        ArrayOperation aobj = new ArrayOperation(Arr);

        aobj.BubbleSort();

        aobj.Display();

        sobj.close();

    }
}