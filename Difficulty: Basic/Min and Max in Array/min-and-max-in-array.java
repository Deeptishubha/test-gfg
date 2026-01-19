class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int max=arr[0];
        int min=arr[0];
        ArrayList<Integer> minmax= new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
            else if(arr[i]<min)
            min=arr[i];
        }
        minmax.add(min);
        minmax.add(max);
        return minmax;
        
    }
}
