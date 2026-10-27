class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n=nums.length;
        int sc=atMost(nums,k-1,n);
        int c=atMost(nums,k,n);
        int ans=c-sc;
        return ans;
    }
    int atMost(int[] nums,int k,int n){
        if(k<1)return 0;
        int c=0,l=0,r=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(r<n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                if(map.get(nums[l])==1)map.remove(nums[l]);
                else map.put(nums[l],map.get(nums[l])-1);
                l=l+1;
            }
            if(map.size()<=k){
                c=c+(r-l+1);
            }
            r++;
        }
        return c;
    }
}