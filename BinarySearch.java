import java.util.ArrayList;
    import java.util.Scanner;

    class ArrayOperation
    {
        public ArrayList<Integer> list;

        public ArrayOperation(ArrayList<Integer> list)
        {
            this.list  = list;
        }

        public int BinaraySearch(int element)
        {
            int Start = 0;

            int End = list.size() - 1;

            int mid = 0;

         
            while(Start <= End)
            {
                mid = (Start + End) / 2;

                if(list.get(mid) == element)
                {
                    return mid;
                }
                else if(list.get(mid) > element)
                {
                    End = mid - 1;
                }
                else 
                {
                    Start = mid + 1;
                }
            }

            return -1;
            
        }  
    }


    class BinarySearch 
    {
        public static void main(String A[])
        {
            Scanner sobj = new Scanner(System.in);

            ArrayList<Integer> list = new ArrayList<>();

            System.out.println("Enter the size of the list");

            int n = sobj.nextInt();

            int Result = 0;

            System.out.println("Enter the elements in an arraylist");

            for(int i = 0 ; i < n ; i++)
            {
                list.add(sobj.nextInt());
            }

            System.out.println("Enter the element which you want to search in list");

            int element = sobj.nextInt();

            ArrayOperation aobj = new ArrayOperation(list);

            Result = aobj.BinaraySearch(element);

            if(Result == -1)
            {
                System.out.println("Element is not present in an arraylist");
            }
            else 
            {
                System.out.println("Element is present in list");
            }
        
            sobj.close();
        }
    }