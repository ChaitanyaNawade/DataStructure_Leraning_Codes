import java.util.Scanner;

class ArrayOperation
{
    public int[][] arr;

    public ArrayOperation(int[][] brr)
    {
        this.arr = brr;
    }


    public int findMax()
    {
        int i = 0 , j = 0 ;
        int max = arr[0][0];

        for(i = 0 ; i < arr.length ; i++)
        {
            for(j = 0 ; j < arr[0].length; j++)
            {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}

class MaxIn2D
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Row = 0 , Col = 0, iRet = 0;

        System.out.println("Enter the number of rows");

        Row = sobj.nextInt();

        System.out.println("Enter the number of colums");

        Col = sobj.nextInt();

        int [][] arr = new int[Row][Col];

        System.out.println("Enter the number in 2D Array");

        for(int i = 0 ; i < Row ; i++)
        {
            for(int j = 0 ; j < Col ; j++)
            {
                arr[i][j] = sobj.nextInt();
            }
        }

        ArrayOperation aobj = new ArrayOperation(arr);

        iRet = aobj.findMax();

        System.out.println("The maximum element from the 2d array is : "+iRet);
    }
}