// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp=n,s=0;
        while(temp>0){
            int d=temp%10;
            s=s+(int)Math.pow(d,3);
            temp=temp/10;
        }
        if(n==s)
        return true;
        else
        return false;
    }
}