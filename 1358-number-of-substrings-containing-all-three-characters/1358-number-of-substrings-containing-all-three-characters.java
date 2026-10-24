class Solution {
    public int numberOfSubstrings(String s) {
        int c=0;
        int[] arr=new int[3];
        arr[0]=arr[1]=arr[2]=-1;
        int n=s.length();
        int i=0;
        while(i<n){
            char ch=s.charAt(i);
            if(ch=='a')arr[0]=i;
            else if(ch=='b')arr[1]=i;
            else arr[2]=i;
            int min=arr[0]<arr[1]?(arr[0]<arr[2]?arr[0]:arr[2]):(arr[1]<arr[2]?arr[1]:arr[2]);
            if(min!=-1){
                c+=min+1;
            }
            i++;
        }
        return c;
    }
}