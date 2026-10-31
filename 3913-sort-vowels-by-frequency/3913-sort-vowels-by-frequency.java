class Solution {
    public String sortVowels(String s) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
                map.put(x,map.getOrDefault(x,0)+1);
                l.add(i);
            }
        }
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->Integer.compare(b.getValue(),a.getValue()));
        Map<Character,Integer> sortedMap=new LinkedHashMap<>();
        for(Map.Entry<Character,Integer> e:list){
            sortedMap.put(e.getKey(),e.getValue());
        }
        StringBuilder sb=new StringBuilder(s);
        for(char k:sortedMap.keySet()){
            int v=sortedMap.get(k);
            for(int i=0;i<v;i++){
                sb.setCharAt(l.get(0),k);
                l.remove(0);
            }
        }
        String str=sb.toString();
        return str;
    }
}