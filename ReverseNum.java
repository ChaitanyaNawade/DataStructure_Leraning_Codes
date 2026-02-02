import java.util.*;

class DigitOperation
{
    public int num;

    public DigitOperation(int num)
    {
        this.num = num;
    }

    public int ReverseNum()
    {
        int RevNum = 0;

        while(num > 0)
        {
            int iDigit = num % 10;

            RevNum = RevNum * 10 + iDigit;

            num = num / 10;
        }

        return RevNum;
    }
}


class ReverseNum 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNum = 0 , iRet = 0;

        System.out.println("Enter the number");

        iNum = sobj.nextInt();

        DigitOperation dobj = new DigitOperation(iNum);

        iRet = dobj.ReverseNum();

        System.out.println("The reverse number is : "+iRet);

        sobj.close();
    }
}