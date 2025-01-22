class Solution {
    public int maxSubArray(int[] nums) {

       int mxSum=Integer.MIN_VALUE;


    int currSum=0;

    for(int i:nums)
    {
      currSum+=i;
      mxSum=Math.max(currSum,mxSum);
      if(currSum<0)
      {
        currSum=0;
      }

    }       


    return mxSum;
    }
}