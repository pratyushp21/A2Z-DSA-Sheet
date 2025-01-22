class Solution {
    public void sortColors(int[] nums) {
        int one=0,two=0;
        
        for(int i:nums)
        {
            if(i==1) one++;
            if(i==2) two++;
        }
        int n=nums.length-one-two;
        int i=0;
        while(n>0)
        {
            nums[i++]=0;
            n--;
        }

       while(one>0)
        {
            nums[i++]=1;one--;
        }   
        while(two>0)
        {
            nums[i++]=2;two--;
        }

        

        
    }
}