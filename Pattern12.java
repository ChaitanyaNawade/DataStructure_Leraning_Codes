import java.util.*;

class Pattern12
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Row = 0 , Col = 0;

        System.out.println("Enter the number of row");

        Row = sobj.nextInt();

        System.out.println("Enter the number of columns");

        Col = sobj.nextInt();

        String str = null;

        System.out.println("Enter the string which you want to print");

        sobj.nextLine();
        str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        int i = 0 , j = 0 , iCnt = 0;

        for(i = 1 ; i <= Row ; i++)
        {
            for(iCnt = 0; iCnt < Arr.length ; iCnt++)
            {
                System.out.print(Arr[iCnt]+" ");
            }
            System.out.println();
        }
    }
    
}