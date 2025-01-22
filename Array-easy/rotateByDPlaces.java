class Solution {

    void reverse(int []arr,int st,int end)
    {
 
     while(st<=end)
     {
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
        st++;end--;
     }


    }
    public void rotate(int[] nums, int k) {
     int n=nums.length;
     k=k%n;
     k=n-k;
     reverse(nums,k,n-1);
     reverse(nums,0,k-1);
     reverse(nums,0,n-1);

    //  int temp=nums[k-1];
    //  nums[k-1]=nums[n-1];
    //  nums[n-1]=temp;

for(int i=0;i<n;i++)
{
    System.out.print(nums[i]+ " ");
}

        
}
}