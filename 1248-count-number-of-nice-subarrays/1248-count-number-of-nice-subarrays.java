class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                nums[i]=1;
            }
            else{
                nums[i]=0;
            }
        }
        int sc=atMost(nums,k-1,n);
        int c=atMost(nums,k,n);
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