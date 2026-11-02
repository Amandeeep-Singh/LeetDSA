class Solution {
    public int minMoves2(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        Arrays.sort(nums);
        int n=nums.length;
        int m=nums[n/2];
        int c=0;
        for(int i=0;i<n;i++){
            c+=Math.abs(m-nums[i]);
        }
        return c;
    }
}