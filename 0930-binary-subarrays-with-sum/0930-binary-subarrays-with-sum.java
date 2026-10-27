class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int sc=atMost(nums,goal-1,n);
        int c=atMost(nums,goal,n);
        int ans=c-sc;
        return ans;
    }
    int atMost(int[] nums,int k,int n){
        if(k<0)return 0;
        int c=0,s=0,l=0,r=0;
        while(r<n){
            s=s+nums[r];
            while(s>k){
                s=s-nums[l];
                l=l+1;
            }
            if(s<=k){
                c=c+(r-l+1);
            }
            r++;
        }
        return c;
    }
}