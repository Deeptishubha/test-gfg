class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int a1=a,b1=b;
        int[] result =new int[2];
        while(a>0 && b>0){
            if(a>b)
            a=a%b;
            else
            b=b%a;
        }
        if(a==0) 
        result[1]=b;
        else
        result[1]=a;
        
        result[0]=(a1/result[1])*b1;
        return result;
    }
}