class Solution {
    public int totalNQueens(int n) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        back(0,n,l,list);
        int s=list.size();
        return s;
    }
    void back(int row,int n,List<Integer> l,List<List<Integer>> list){
        if(row==n){
            list.add(new ArrayList<>(l));
            return ;
        }
        for(int col=0;col<n;col++){
            if(isSafe(row,col,l)){
                l.add(col);
                back(row+1,n,l,list);
                l.remove(l.size()-1);
            }
        }
    }
    boolean isSafe(int row,int col,List<Integer> l){
        for(int r=0;r<l.size();r++){
            int c=l.get(r);
            if(c==col)return false;
            if(Math.abs(row-r)==Math.abs(col-c))return false;
        }
        return true;
    }
}