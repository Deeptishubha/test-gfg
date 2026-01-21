class Solution {
    int missingNum(int arr[]) {
        // code here
        int sumOfArray=0;
        int len=arr.length;
        long n=len+1;
        long totalSum=(n*(n+1))/2;
        for(int i=0;i<len;i++){
            sumOfArray=sumOfArray+arr[i];
            
        }
        
        int result=(int)(totalSum - sumOfArray);
        return result;
    }
}