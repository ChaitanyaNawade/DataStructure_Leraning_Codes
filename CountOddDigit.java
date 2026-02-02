import java.util.*;

class DigitOperation
{
    public int num;

    public DigitOperation(int num)
    {
        this.num = num;
    }

    public int CountDigit()
    {
        int iCount = 0;

        while(num > 0)
        {
            int iDigit = num % 10;

            if(iDigit % 2 != 0)
            {
                iCount++;
            }

            num = num / 10;
        }

        return iCount;
    }
}


class CountOddDigit 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNum = 0 , iRet = 0;

        System.out.println("Enter the number");

        iNum = sobj.nextInt();

        DigitOperation dobj = new DigitOperation(iNum);

        iRet = dobj.CountDigit();

        System.out.println("The count of Odd Digit in number is : "+iRet);

        sobj.close();
    }
}