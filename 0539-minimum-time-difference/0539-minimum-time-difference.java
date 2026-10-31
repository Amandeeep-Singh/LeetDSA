class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n=timePoints.size();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            String[] s=timePoints.get(i).trim().split(":");
            arr[i][0]=Integer.parseInt(s[0]);
            arr[i][1]=Integer.parseInt(s[1]);
        }
        Arrays.sort(arr,(a,b)->{if(a[0]==b[0])return a[1]-b[1];
            return a[0]-b[0];});
        int d=Integer.MAX_VALUE; 
        int x=(23+arr[0][0]-arr[n-1][0])*60;
        int y=60+arr[0][1]-arr[n-1][1];
        d=Math.min(d,x+y);
        for(int i=1;i<n;i++){
            int a=(arr[i][0]-arr[i-1][0])*60;
            int b=arr[i][1]-arr[i-1][1];
            d=Math.min(d,a+b);
        }
        return d;
    }
}