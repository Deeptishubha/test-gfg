class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int reverse=0;
        int temp=n;
        while(temp!=0){
            int d=temp%10;
            reverse=reverse*10+d;
            temp=temp/10;
        }
        return (int)Math.pow(n,reverse);
    }
}
