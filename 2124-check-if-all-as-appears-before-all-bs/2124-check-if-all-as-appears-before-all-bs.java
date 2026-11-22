class Solution {
    public boolean checkString(String s) {
        boolean f=false;
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='b'){
                f=true;
            }
            if(f==true && c=='a'){
                return false;
            }
        }
        return true;
    }
}