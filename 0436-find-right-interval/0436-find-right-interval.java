class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n=intervals.length;
        int[][] arr=new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=intervals[i][0];
            arr[i][1]=intervals[i][1];
            arr[i][2]=i;
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int x=binarySearch(arr,intervals[i][1],n);
            res[i]=x;
        }
        return res;
    }
    int binarySearch(int[][] arr,int t,int n){
        int s=0,e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid][0]<t){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        if(s==n)return -1;
        return arr[s][2];
    }
}