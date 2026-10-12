class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        int k=n/2;
        long sum=0;
        for(int i=n-1;i>=0;i--){
            if(i>=k){
                sum+=(long)nums[i];
            }
            else{
                sum-=(long)nums[i];
            }
        }
        return sum;
    }
}