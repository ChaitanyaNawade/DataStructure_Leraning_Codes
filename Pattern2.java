import java.util.*;

class Pattern2 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Row = 0 , Col = 0;

        System.out.println("Enter the number of row");

        Row = sobj.nextInt();

        System.out.println("Enter the number of columns");

        Col = sobj.nextInt();

        int i = 0 , j = 0;

        for(i = 1 ; i <= Row ; i++)
        {
            for(j = 1 ; j <= Col ; j++)
            {
                if(i == j || (i + j) == (Row + 1))
                {
                    System.out.print("* ");
                } 
                else 
                {
                    System.out.print("  ");
                }   
            }
            System.out.println();
        }
    }
}