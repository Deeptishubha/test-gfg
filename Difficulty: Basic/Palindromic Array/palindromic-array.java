/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(int i=0;i<arr.length;i++){
            int num=arr[i],s=0;
            while(num!=0){
                int r=num%10;
                s=s*10 +r;
                num=num/10;
            }
            if(arr[i]!=s)
             return false;
            
        }
        return true;
    }
}