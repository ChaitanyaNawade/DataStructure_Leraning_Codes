import java.util.*;

class ReverseEachRow 
{
    public static void main(String A[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0;
        int iCol = 0;

        System.out.println("Enter the length of the rows");
        iRow = sobj.nextInt();

        System.out.println("Enter the length of column");
        iCol = sobj.nextInt();

        int[][] mat = new int[iRow][iCol];

        int i = 0, j = 0;

        System.out.println("Enter the elements in an matrix");

        for (i = 0; i < mat.length; i++) 
        {
            for (j = 0; j < mat[i].length; j++)
            {
                mat[i][j] = sobj.nextInt();
            }
        }

        for( i = 0 ; i < mat.length ; i++)
        {   
             int start = 0;
             int end= mat.length  - 1;
             
             while(start < end)
             {
                int temp  = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
             }
        }

        for (i = 0; i < mat.length; i++) 
        {
            for (j = 0; j < mat[i].length; j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}