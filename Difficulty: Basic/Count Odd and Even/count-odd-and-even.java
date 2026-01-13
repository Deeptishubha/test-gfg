class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int ocount=0,ecount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                ecount++;
            }
            else{
                ocount++;
            }
        }
        int[] ans=new int[2];
        ans[0]=ocount;
        ans[1]=ecount;
        return ans;
    }
}