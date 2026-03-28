class Solution {
    public boolean isHappy(int n) {
        HashSet <Integer> hs= new HashSet<Integer>();

        while(!hs.contains(n)){
            hs.add(n);
            int sqsum=0;
            while(n!=0){
                int rem=n%10;
                sqsum +=rem *rem;
                n=n/10;


            }
            if(sqsum==1) return true;
            else n=sqsum;
        }
        return false;
    }
}