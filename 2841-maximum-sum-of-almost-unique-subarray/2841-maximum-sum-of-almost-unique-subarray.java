class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        long maxSum=0;
        int n=nums.size();
        int i=0,j=0;
        long sum=0;
        Map<Long,Integer> map=new HashMap<>();
        while(i<k){
            long x=(long)nums.get(i++);
            sum+=x;
            map.put(x,map.getOrDefault(x,0)+1);
        }
        while(i<n){
            if(map.size()>=m){
                maxSum=Math.max(maxSum,sum);
            }
            long y=(long)nums.get(j);
            sum-=y;
            if(map.get(y)==1)map.remove(y);
            else map.put(y,map.get(y)-1);
            j++;
            long x=(long)nums.get(i);
            sum+=x;
            map.put(x,map.getOrDefault(x,0)+1);
            i++;
        }
        if(map.size()>=m){
                maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}