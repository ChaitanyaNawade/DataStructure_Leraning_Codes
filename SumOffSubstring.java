import java.util.Scanner;

class StringOperation 
{
    public String str;

    public StringOperation(String str)
    {
        this.str = str;
    }

    public int PrintSumOfSubString()
    {
        int i = 0 ,j = 0 , n = 0 , sum = 0;

        for(i = 0 ; i <= str.length(); i++)
        {
            for(j = i +1; j <= str.length(); j++)
            {
                n = Integer.parseInt(str.substring(i,j));
                sum = sum + n;
            }
        }

        return sum;
    }
}

class SumOffSubstring
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;

        String s = "";

        System.out.println("Enter the string");

        s  = sobj.nextLine();

        StringOperation ssobj = new StringOperation(s);
        
        iRet = ssobj.PrintSumOfSubString();

        System.out.println("the sum of all substring is : "+iRet);

        sobj.close();
    }
}