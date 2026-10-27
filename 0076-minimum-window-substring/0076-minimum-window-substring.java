class Solution {
    public String minWindow(String s, String t) {
        int sz=t.length();
        int n=s.length();
        int c=0,l=0,r=0,st=-1,end=-1,min=Integer.MAX_VALUE;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<sz;i++){
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        while(r<n){
            char ch=s.charAt(r);
            if(map.containsKey(ch) && map.get(ch)>0){
                c++;
            }
            map.put(ch, map.getOrDefault(ch, 0)-1);
            while(c==sz){
                if(min>(r-l+1)){
                    min=r-l+1;
                    st=l;
                    end=r+1;
                }
                char x=s.charAt(l);
                map.put(x,map.getOrDefault(x,0)+1);
                if(map.get(x)>0)c--;
                l++;
            }
            r++;
        }
        return st==-1?"":s.substring(st,end);
    }
}