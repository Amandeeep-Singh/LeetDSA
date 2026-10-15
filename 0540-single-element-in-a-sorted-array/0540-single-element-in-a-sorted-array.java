class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s=0,e=nums.length-1;
        if(s==e)return nums[s];
        while(s<e){
            int mid=s+(e-s)/2;
            if(nums[s]!=nums[s+1])return nums[s];
            if(nums[e]!=nums[e-1])return nums[e];
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if(mid%2==0 && nums[mid]==nums[mid-1]){
                e=mid;
            }
            else if(mid%2==0 && nums[mid]!=nums[mid-1]){
                s=mid;
            }
            else if(mid%2!=0 && nums[mid]==nums[mid-1]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
}