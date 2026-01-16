// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int s=0;
        while(n!=0){
            int r=n%10;
            if(r==0){
                n=n/10;
                continue;
            }
            else{
                s=s*10+r;
                 n=n/10;
            }
            
        }
        return s;
    }
}