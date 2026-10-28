class Solution {
    public String[] createGrid(int m, int n) {
        String[] str=new String[m];
        StringBuilder sb=new StringBuilder();
        sb.append('.');
        for(int i=1;i<n;i++){
            sb.append('#');
        }
        for(int i=0;i<m-1;i++){
            str[i]=sb.toString();
        }
        String x=sb.toString().replace("#",".");
        str[m-1]=x;
        return str;
    }
}