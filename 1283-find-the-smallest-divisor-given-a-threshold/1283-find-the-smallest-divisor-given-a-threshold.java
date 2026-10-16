class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=nums.length;
        int max=nums[0];
        for(int n:nums){
            max=Math.max(n,max);
        }
        int res=-1;
        int s=1,e=max;
        while(s<=e){
            int mid=s+(e-s)/2;
            int c=0;
            for(int i=0;i<l;i++){
                c+=(nums[i]+mid-1)/mid;
            }
            if(threshold>=c){
                res=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return res;
    }
}