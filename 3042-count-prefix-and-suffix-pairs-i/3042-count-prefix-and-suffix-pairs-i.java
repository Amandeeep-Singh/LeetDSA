class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int c=0;
        int n=words.length;
        for(int i=0;i<n-1;i++){
            String s1=words[i];
            for(int j=i;j<n;j++){
                String s2=words[j];
                int x=s1.length(),y=s2.length();
                if(i==j || x>y)continue;
                if(s2.substring(0,x).equals(s1) && s1.equals(s2.substring(y-x,y))){
                    c++;
                }
            }
        }
        return c;
    }
}