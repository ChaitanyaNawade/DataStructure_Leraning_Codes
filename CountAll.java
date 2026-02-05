/// Write a program which accepts a string from the user and counts the number of small letters, capital letters, and digits in the string.
import java.util.Scanner;

class StringOperation 
{
    public String str ;

    public StringOperation(String str)
    {
        this.str = str;
    }

    public void CountAll()
    {
        char arr[] = str.toCharArray();

        int iCapital = 0, iSmall = 0 , iDigit = 0 , iCnt = 0;

        for(iCnt = 0 ; iCnt < str.length(); iCnt++)
        {
            if(arr[iCnt] >= 'a' && arr[iCnt] <= 'z')
            {
                iSmall++;
            }
            else if(arr[iCnt] >= 'A' && arr[iCnt] <= 'Z')
            {
                iCapital++;
            }
            else if(arr[iCnt] >= '0' && arr[iCnt] <= '9')
            {
                iDigit++;
            }
        }

        System.out.println("the number of count small are : "+iSmall);
        System.out.println("the number of capital letters are : "+iCapital);
        System.out.println("the number of digits are : "+iDigit);
    }
}

class CountAll 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str;

        System.out.println("Enter the string");

        str = sobj.nextLine();

        StringOperation ssobj = new StringOperation(str);

        ssobj.CountAll();

        sobj.close();
    }
}