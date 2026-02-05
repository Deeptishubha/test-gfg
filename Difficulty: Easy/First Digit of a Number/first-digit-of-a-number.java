class Solution {
    public static int firstDigit(int n) {
        // code here
        int r=0;
        while(n>0){
            r=n%10;
            n=n/10;
        }
        return r;
    }
}