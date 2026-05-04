class ArrayOperation
{
    public int Arr[];

    public ArrayOperation(int Arr[])
    {
        this.Arr = Arr;
    }

    public void moveneg()
    {
        int j = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] < 0)
            {
                int temp = Arr[i];
                Arr[i] = Arr[j];
                Arr[j] = temp;
                j++;
            }
        }
    }

    public void display()
    {
        for(int i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i] + " ");
        }
    }
}

class MoveNeg
{
    public static void main(String A[])
    {
        int Arr[] = {10, -2, 3, -5};

        ArrayOperation aobj = new ArrayOperation(Arr);
        aobj.moveneg();
        aobj.display();
    }
}