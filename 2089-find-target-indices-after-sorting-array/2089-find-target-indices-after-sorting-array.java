class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int s=0,e=nums.length-1;
        List<Integer> list=new ArrayList<>();
        int x=binarySearchF(nums,0,nums.length-1,target);
        if(x==-1)return list;
        int y=binarySearchL(nums,0,nums.length-1,target);
        for(int i=x;i<=y;i++){
            list.add(i);
        }
        return list;
    }
    int binarySearchF(int[] nums,int s,int e,int t){
        int res=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==t){
                res=mid;
                e=mid-1;
            }
            else if(nums[mid]<t){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return res;
    }
    int binarySearchL(int[] nums,int s,int e,int t){
        int res=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==t){
                res=mid;
                s=mid+1;
            }
            else if(nums[mid]<t){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return res;
    }
}