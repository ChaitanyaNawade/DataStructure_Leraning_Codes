import java.util.Scanner;

class ArrayOperation
{
    public int[][] arr;

    public ArrayOperation(int[][] brr)
    {
        this.arr = brr;
    }

    public int findMinFromRowMax()
    {
        int i = 0 , j = 0 ;
        
        int rowSum = 0 , Ret = 0;

        int res[] = new int[arr.length];

        for(i = 0 ; i < arr.length ; i++)
        {
            int max = arr[0][0]; 
            
            for(j = 0 ; j < arr[i].length; j++)
            {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }

            res[i] = max;
        }


        int min = res[0];

        for(i = 0 ; i < res.length ; i++)
        {
            if(res[i] < min)
            {
                min = res[i];
            }
        }

        return min;
       
    }
}

class MinFromAllMax
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

       iRet = aobj.findMinFromRowMax();

       System.out.println("The minimum element from all maximum is : "+iRet);
    }
}