class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n=people.length;
        int boat=0;
        int l=0,r=n-1;
        while(l<r){
            int s=people[l]+people[r];
            if(s<=limit){
                people[l]=-1;
                people[r]=-1;
                boat++;
                l++;
                r--;
            }
            else{
                r--;
            }
        }
        for(int i=0;i<n;i++){
            if(people[i]!=-1)boat++;
        }
        return boat;
    }
}