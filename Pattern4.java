import java.util.*;

/*
  A B C D
  a b c d
  A B C D
  a b c d
 */

class Pattern4 
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
            int B = 1;
            for(j = 1 ; j <= Col ; j++)
            {
               if(i % 2 == 0)
               {
                System.out.print((char)(96+B)+" ");
                B++;
               }
               else 
               {
                System.out.print((char)(64+B)+" ");
                B++;
               }
            }
            System.out.println();
        }
    }
}