import java.util.HashSet;
import java.util.Iterator;

class Duplicate 
{
    public static void main(String A[])
    {
        int Arr[] = {10,20,20,40,10};

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> Duplicate = new HashSet<>();

        for(int i = 0 ; i < Arr.length ; i++)
        {
            if(set.contains(Arr[i]))
            {
                Duplicate.add(Arr[i]);
            }
            else 
            {
                set.add(Arr[i]);
            }

        }

        System.out.println(Duplicate);

        // Iterator iobj = Duplicate.iterator();

        // while (iobj.hasNext()) 
        // {
        //     System.out.print(iobj.next());
        //     iobj++;
        // }
     }
}