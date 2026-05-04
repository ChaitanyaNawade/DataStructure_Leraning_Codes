import java.util.*;

/*
  A A A A A
  B B B B B
  C C C C C
 */

class Pattern6
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

        int Num = 4;
        
        for(i = 1 ; i <= Row ; i++)
        {
            for(j = 1 ; j <= Col ; j++)
            {
               System.out.print(Num+" ");
            }
            System.out.println();
            Num--;
        }
    }
}