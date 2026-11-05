class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        for(int a1:arr1){
            boolean f=true;
            for(int a2:arr2){
                if(Math.abs(a1-a2)<=d){
                    f=false;
                    break;
                }
            }
            if(f)c++;
        }
        return c;
    }
}