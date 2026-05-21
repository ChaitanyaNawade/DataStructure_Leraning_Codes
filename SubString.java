import  java.util.*;

class StringOperation
{
    public String str;

    public StringOperation(String str)
    {
        this.str = str;
    }


    public void DisplaySubString()
    {
        int i = 0 , j = 0;

        for(i = 0 ; i <= str.length() ; i++)
        {
            for(j = i+1 ; j <= str.length();j++)
            {
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}

class SubString 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str = " ";

        System.out.println("Enter the string");

        str = sobj.nextLine();

        StringOperation ssobj = new StringOperation(str);

        ssobj.DisplaySubString();

        sobj.close();
    }
}