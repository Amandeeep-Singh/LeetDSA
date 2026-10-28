class Solution {
    public int maxVowels(String s, int k) {
        int l=0,r=0,c=0,max=0;
        int n=s.length();
        while(r<n){
            char ch=s.charAt(r);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                c++;
            }
            if(r-l+1==k){
                max=Math.max(max,c);
                char x=s.charAt(l);
                if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
                    c--;
                }
                l++;
            }
            r++;
        }
        return max;
    }
}