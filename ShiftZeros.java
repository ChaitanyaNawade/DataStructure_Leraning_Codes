class ShiftZeros
{
    public static void main(String[] args) 
    {
        int Arr[]  = {10,0,33,0,25};


        int iCnt = 0; 
        int pos = 0;

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            if(Arr[iCnt] != 0)
            {
                Arr[pos] = Arr[iCnt];
                pos++;
            }
        }

        while(pos < Arr.length )
        {
            Arr[pos]= 0;
            pos++;
        }

        for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
        {
            System.out.print(" "+Arr[iCnt]);
        }

        
    }
}