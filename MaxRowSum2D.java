import java.util.Scanner;

class ArrayOperation
{
    public int[][] arr;

    public ArrayOperation(int[][] brr)
    {
        this.arr = brr;
    }

    public void findMaxRowSum()
    {
        int i = 0 , j = 0 ;
        
        int rowSum = 0 , Ret = 0;

        for(i = 0 ; i < arr.length ; i++)
        {
            int sum = 0; 
            
            for(j = 0 ; j < arr[i].length; j++)
            {
                sum = sum + arr[i][j];
            }

            if(sum > rowSum)
            {
               rowSum = sum;
               Ret = i;
            }
        }

        System.out.println("The row which having maximum sum is : "+ i +"th Row" + "and its sum is : "+rowSum);
    }
}

class MaxRowSum2D
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

        aobj.findMaxRowSum();
    }
}