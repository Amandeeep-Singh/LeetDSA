class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        int l=0,h=m-1;
        int[] arr=new int[2];
        while(l<=h){
            int mid=l+(h-l)/2;
            int c=0;
            for(int i=1;i<n;i++){
                if(mat[mid][c]<mat[mid][i]){
                    c=i;
                }
            }
            int t=mid>0?mat[mid-1][c]:-1;
            int d=mid<m-1?mat[mid+1][c]:-1;
            if(t<mat[mid][c] && d<mat[mid][c]){
                arr[0]=mid;arr[1]=c;
                return arr;
            }
            else if(t>mat[mid][c]){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return arr;
    }
}