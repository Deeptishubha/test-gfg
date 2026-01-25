// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum=0,reverse=0;
        int temp=n;
        while(temp!=0){
            int d=temp%10;
            sum=sum+d;
            temp=temp/10;
        }
        temp=sum;
         while(temp!=0){
            int d=temp%10;
            reverse=reverse*10+d;
            temp=temp/10;
        }
        return sum==reverse;
    }
}