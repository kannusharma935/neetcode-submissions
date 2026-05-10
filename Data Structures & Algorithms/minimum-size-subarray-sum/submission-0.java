class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int res=Integer.MAX_VALUE;
        int sum=0;
        int j=0;
        for(int i=0;i<n;i++){           
            sum+=nums[i];            
            while(sum>=target){
            res=Math.min(i-j+1,res);
            sum-=nums[j];
            j++;       
            }

        }        
        
        return res==Integer.MAX_VALUE?0:res;
    }
}