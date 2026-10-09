class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int l=0,r=0,z=0;
        while(r<nums.length){
            if(nums[r]==0){
                z++;
            }
            while(z>k){
                if(nums[l]==0){
                    z--;
                }
                max=Math.max(max,r-l);
                l++;
            }
            r++;
        }
        max=Math.max(max,r-l);
        return max;
    }
}