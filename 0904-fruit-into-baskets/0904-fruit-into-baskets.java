class Solution {
    public int totalFruit(int[] fruits) {
        // int n=fruits.length;
        // if(n<3)return n;
        // int max=0;
        // Map<Integer,Integer> map=new HashMap<>();
        // int i=0,j=0;
        // while(j<n){
        //     map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
        //     j++;
        //     while(map.size()>2){
        //         if(map.get(fruits[i])==1)map.remove(fruits[i]);
        //         else map.put(fruits[i],map.get(fruits[i])-1);
        //         i++;
        //     }
        //     max=Math.max(max,j-i);
        // }
        // max=Math.max(max,j-i);
        // return max;
        int l=0,r=0,ml=0;
        int n=fruits.length;
        Map<Integer,Integer> map=new HashMap<>();
        while(r<n){
            int x=fruits[r];
            map.put(x,map.getOrDefault(x,0)+1);
            if(map.size()>2){
                int y=fruits[l];
                if(map.get(y)==1)map.remove(y);
                else map.put(y,map.get(y)-1);
                l++;
            }
            if(map.size()<=2){
                ml=Math.max(ml,r-l+1);
            }
            r++;
        }
        return ml;
    }
}