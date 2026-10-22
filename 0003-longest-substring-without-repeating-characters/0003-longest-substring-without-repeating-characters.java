class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int l=0,r=0;
        int n=s.length();
        int ml=0;
        while(r<n){
            char c=s.charAt(r);
            if(map.containsKey(c)){
                if(map.get(c)<l){
                    map.put(c,r);
                }
                else{
                    l=map.get(c)+1;
                    map.put(c,r);
                }
            }
            else{
                map.put(c,r);
            }
            ml=Math.max(ml,r-l+1);
            r++;
        }
        ml=Math.max(ml,r-l);
        return ml;
    }
}