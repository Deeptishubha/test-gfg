// User function Template for Java
class Solution {
    public static int gcd(int a, int b) {

        // code here to calculate and return gcd of a and b
        while(a!=0 && b!=0){
        if(a<b)
        b=b%a;
        else
        a=a%b;
        }
        if(a==0)
        return b;
        else 
        return a;
        
        
    }
}