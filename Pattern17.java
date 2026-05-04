import java.util.Scanner;

class Pattern17 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0 , j =0;

        System.out.println("Enter the string whihch you want to print");

        String str = null;

        // sobj.nextLine();

        str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        int iRow = Arr.length;

        for(iCnt = 1 ; iCnt <= iRow ; iCnt++)
        {
            for(j = 0 ; j < iCnt ; j++)
            {
                System.out.print(Arr[j]+" ");
            }
            System.out.println();
        }

        for(iCnt = iRow - 1 ; iCnt > 0 ; iCnt--)
        {
            for(j = 0 ; j < iCnt ; j++)
            {
                System.out.print(Arr[j]+" ");
            }
            System.out.println();
        }
    }
}