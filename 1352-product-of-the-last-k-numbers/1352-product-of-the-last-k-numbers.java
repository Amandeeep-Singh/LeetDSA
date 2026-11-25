class ProductOfNumbers {
    List<Integer> prod;
    public ProductOfNumbers() {
        this.prod=new ArrayList<>();
        prod.add(1);
    }
    
    public void add(int num) {
        if(num==0){
            prod.clear();
            prod.add(1);
        }
        else{
            int s=prod.size();
            int x=prod.get(s-1);
            int p=num*x;
            prod.add(p);
        }
    }
    
    public int getProduct(int k) {
        int s=prod.size();
        if(k>=s)return 0;
        int l=s-k-1;
        int ans=prod.get(s-1)/prod.get(l);
        return ans;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */