class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=(long)Math.abs(nums[i]);
        }
        Arrays.sort(arr);
        int k=n/2;
        long sum=0;
        for(int i=n-1;i>=0;i--){
            if(i>=k){
                sum+=(arr[i]*arr[i]);
            }
            else{
                sum-=(arr[i]*arr[i]);
            }
        }
        return sum;
    }
}