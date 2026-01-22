// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int temp=n,c=0;
        while(temp>0){
            int r=temp%10;
            if(r==0){
                temp=temp/10;
                continue;
            }
           else if(n%r==0){
               c++;
           }
            temp=temp/10;
        }
        return c;
    }
}