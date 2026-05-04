import java.util.*;

/*
  A B C D
  A B C D
  A B C D
  A B C D
 */

class Pattern3 
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
            char ch = 'A';
            for(j = 1 ; j <= Col ; j++)
            {
                System.out.print(ch+" "); 
                ch++;
            }
            System.out.println();
        }
    }
}