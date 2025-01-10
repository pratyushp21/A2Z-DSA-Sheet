
class Solution {
    public static int largest(int[] arr) {
        // code here
        int mx=-1;
        
        for(int i=0;i<arr.length;i++)
        {
            
          mx=Math.max(mx,arr[i]);    
            
        }
        return mx;
        
    }
}
