class Solution {
    public static double posAverage(int[] arr) {
        // Code here
        double sum=0,c=0;
        for(int i= 0;i<arr.length;i++){
            if(arr[i] >= 0){
                sum += arr[i];
                c++;
            }
        }
        return sum/c;
    }
}
