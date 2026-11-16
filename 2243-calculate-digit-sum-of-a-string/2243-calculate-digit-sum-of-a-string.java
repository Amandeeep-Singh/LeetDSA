class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        while(sb.length()>k){
            StringBuilder sbd=new StringBuilder();
            int i=0,sum=0,c=0;
            while(i<sb.length()){
                char ch=sb.charAt(i);
                sum+=ch-'0';
                if(c==k-1){
                    sbd.append(sum);
                    c=-1;
                    sum=0;
                }
                c++;
                i++;
            }
            if(c!=0)sbd.append(sum);
            sb=sbd;
        }
        return sb.toString();
    }
}