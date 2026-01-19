// User function Template for Java

class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
        // code here.
        int[] result={-1,-1};
        for(int i=0;i<arr.length;i++){
           if(arr[i]==key){
           result[0]=i;
           break;}
        }
        for(int i=arr.length-1;i>=0;i--){
           if(arr[i]==key){
           result[1]=i;
           break;}
        }
        return result;
    }
}