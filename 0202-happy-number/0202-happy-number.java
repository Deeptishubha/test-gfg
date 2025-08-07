class Solution {
    public boolean isHappy(int n) {
        int rem;
        while(n!=1 && n!=4){
            int s=0;
            while(n>0){
                rem=n%10;
                s=s+(int)(Math.pow(rem,2));
                n=n/10;
        }
        n=s;}
        if(n==1){
            return true;
        }
        else{
            return false;
        }
    }
}