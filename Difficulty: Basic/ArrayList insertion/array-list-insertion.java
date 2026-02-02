class Solution {
    public static ArrayList<Integer> fillArrayList(int arr[]) {
        // Your code here
        ArrayList<Integer> arraylist=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            arraylist.add(arr[i]);
        }
        return arraylist;
    }
}