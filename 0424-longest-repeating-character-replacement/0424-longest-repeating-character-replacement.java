class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,ml=0,mf=0;
        int n=s.length();
        int[] hash=new int[26];
        while(r<n){
            char c=s.charAt(r);
            hash[c-'A']++;
            mf=Math.max(mf,hash[c-'A']);
            if((r-l+1)-mf>k){
                hash[s.charAt(l)-'A']--;
                mf=0;
                l++;
            }
            if((r-l+1)-mf<=k){
                ml=Math.max(ml,r-l+1);
            }
            r++;
        }
        return ml;
    }
}