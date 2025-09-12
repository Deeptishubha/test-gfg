class Solution {
    public static boolean prime(int n) {
        // Write your code here
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            return true;
        }
        else {
            return false;
        }
    }
}