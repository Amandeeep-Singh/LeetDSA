class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] qr=new int[queries.length];
        int[] wr=new int[words.length];
        int[] ans=new int[queries.length];
        int idx=0;
        for(String q:queries){
            TreeMap<Character,Integer> map=new TreeMap<>();
            for(int i=0;i<q.length();i++){
                map.put(q.charAt(i),map.getOrDefault(q.charAt(i),0)+1);
            }
            Map.Entry<Character, Integer> e = map.entrySet().iterator().next();
            Integer v=e.getValue();
            qr[idx++]=v;
        }
        idx=0;
        for(String q:words){
            TreeMap<Character,Integer> map=new TreeMap<>();
            for(int i=0;i<q.length();i++){
                map.put(q.charAt(i),map.getOrDefault(q.charAt(i),0)+1);
            }
            Map.Entry<Character, Integer> e = map.entrySet().iterator().next();
            Integer v=e.getValue();
            wr[idx++]=v;
        }
        Arrays.sort(wr);
        idx=0;
        for(int q:qr){
            int a=bs(wr,0,wr.length-1,q);
            ans[idx++]=a;
        }
        return ans;
    }
    int bs(int[] nums,int s,int e,int t){
        while(s<=e){
            if(nums[s]>t){
                break;
            }
            s++;
        }
        int res=e-s+1;
        return res;
    }
}