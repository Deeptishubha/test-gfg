// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int[] result=new int[n];
        int a=0,b=1;
        if(n>=1){
            result[0]=0;
        }
        if(n>=2){
            result[1]=1;
            
        }
       

        for(int i=2;i<=n-1;i++){
           
            result[i]=result[i-1]+result[i-2];
        }
        return result;
            
        
    }
}