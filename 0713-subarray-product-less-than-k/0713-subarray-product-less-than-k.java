class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)return 0;
        int n=nums.length;
        int l=0,r=0;
        long p=1;
        int c=0;
        while(r<n){
            p=p*nums[r];
            while(p>=k){
                p/=nums[l];
                l++;
            }
            if(p<k){
                c+=r-l+1;
            }
            r++;
        }
        return c;
    }
}