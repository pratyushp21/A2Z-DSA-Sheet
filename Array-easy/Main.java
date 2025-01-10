class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        // idea is to find second largest in one pass
        int mx=arr[0];
        int secMax=-1;
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>mx)
            {
                secMax=mx;
                mx=arr[i];
            }
            else if(arr[i]>secMax && arr[i]<mx) secMax=arr[i];
             
        }
        
        if(mx==secMax) secMax=-1;
        
        return secMax;
    }
}