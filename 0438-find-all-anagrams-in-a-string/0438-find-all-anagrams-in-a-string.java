class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length(),k=p.length();
        Map<Character,Integer> map=new HashMap<>();
        int l=0,r=0,c=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<k;i++){
            char ch=p.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        while(r<n){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)-1);
            if(map.get(ch)>=0){
                c++;
            }
            if(r-l+1==k){
                if(c==k){
                    list.add(l);
                }
                char x=s.charAt(l);
                map.put(x,map.getOrDefault(x,0)+1);
                if(map.get(x)>0)c--;
                l++;
            }
            r++;
        }
        return list;
    }
}