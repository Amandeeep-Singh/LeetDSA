class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        if(n==1 || (n==2 && nums[0]!=nums[1]))return n;
        int mi=0,md=0;
        int l=0,r=0;
        while(r<n-1){
            if(nums[r]>=nums[r+1]){
                mi=Math.max(mi,r-l+1);
                l=r+1;
            }
            r++;
        }
        mi=Math.max(mi,r-l+1);
        l=0;r=0;
        while(r<n-1){
            if(nums[r]<=nums[r+1]){
                md=Math.max(md,r-l+1);
                l=r+1;
            }
            r++;
        }
        md=Math.max(md,r-l+1);
        int ans=Math.max(mi,md);
        return ans;
    }
}