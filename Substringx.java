import java.util.*;

class StringOperation
{
    public String str;

    public StringOperation(String str)
    {
        this.str = str;
    }

    public void PrintAllSubString()
    {
        int n = str.length();

        int i = 0 , j = 0;

        for(i = 0 ; i <= n ; i++)
        {
            for(j = i + 1; j <= n ; j++)
            {
                System.out.print(str.substring(i,j)+" ");
            }
             System.out.println();
        }
       
    }
}


class Substringx 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter the string");

        str = sobj.nextLine();

        StringOperation ssobj= new StringOperation(str);

        ssobj.PrintAllSubString();
    }
}