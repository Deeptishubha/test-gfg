

class Solution {
    public int isPrime(int N) {
        // code here
        int c=0;
    for(int i=1;i<=N;i++){
        if(N%i==0)
        c++;
    }
       if(c==2){
           return 1;
       } 
       else{
           return 0;
       }
    }
}