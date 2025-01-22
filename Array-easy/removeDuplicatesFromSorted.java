class Solution {
    public int removeDuplicates(int[] nums) {
         
         int n=nums.length;
        //  if(n==1) return 1;

         int i=0,j=1;
         while(j < n)
         {
           if(nums[j]!=nums[i])
           {
             nums[i+1]=nums[j];
             i++;
           }
           j++;

         }

        // System.out.println(Arrays.toString(nums));
        return i+1;
    }
}