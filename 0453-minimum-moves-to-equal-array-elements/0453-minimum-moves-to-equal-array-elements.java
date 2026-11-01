class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        long sum=0;
        for(int num:nums){
            min=Math.min(min,num);
            sum+=(long)num;
        }
        int ans=(int)sum-(min*n);
        return ans;
    }
}