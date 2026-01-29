
class Solution {
    public String average(int arr[]) {
        // code here
        int totalprice=0;
        for(int i=0;i<arr.length;i++){
            totalprice+=arr[i];
        }
        double average=(double)totalprice/arr.length;
        return String.format("%.2f",average);
    }
}