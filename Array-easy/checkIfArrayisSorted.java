class Solution {
    public boolean check(int[] nums) {
        int mn=0;
        int n=nums.length;
        int temp=n;
        boolean ok=true;
        for(int i=0;i<n;i++)
        {
            int st=i;
            temp=n;
            ok=true;
            mn=0;
            while(temp!=0){
           int mod=st%n;
           if(nums[mod]>=mn){
               mn=nums[mod];
           }
           else {
              ok=false;
              break;
           }
          st++;
          temp--;

        } 
        if(ok==true) break;
        }
        return ok;
        
    }
}