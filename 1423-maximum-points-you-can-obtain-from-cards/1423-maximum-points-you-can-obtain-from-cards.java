class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int maxSum=0;
        int ls=0,rs=0;
        int i=0,j=cardPoints.length;
        while(i<k){
            ls+=cardPoints[i];
            i++;
        }
        if(k==j)return ls;
        while(i>0){
            maxSum=Math.max(maxSum,ls+rs);
            i--;
            j--;
            ls-=cardPoints[i];
            rs+=cardPoints[j];
        }
        maxSum=Math.max(maxSum,ls+rs);
        return maxSum;
    }
}