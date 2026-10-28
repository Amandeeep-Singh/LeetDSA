class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n=colors.length;
        int c=0;
        if(colors[0]!=colors[1] && colors[0]!=colors[n-1])c++;
        if(colors[n-1]!=colors[0] && colors[n-1]!=colors[n-2])c++;
        for(int i=1;i<n-1;i++){
            if(colors[i]!=colors[i-1] && colors[i]!=colors[i+1])c++;
        }
        return c;
    }
}