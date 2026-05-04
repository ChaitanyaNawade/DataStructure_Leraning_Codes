class Solution 
{
    public int maxSubArray(int[] arr) 
    {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            currentSum += arr[i];

            if(currentSum > maxSum)
            {
                maxSum = currentSum;
            }

            if(currentSum < 0)
            {
                currentSum = 0;
            }
        }

        return maxSum;
    }
}

class kadane 
{
    public static void main(String A[])
    {
        int Arr[] = {1,-2,3,-1,4};

        Solution sobj = new Solution();

        int iRet = sobj.maxSubArray(Arr);

        System.out.println("The Addition of the maximum subarray is ; "+iRet);
    }

}