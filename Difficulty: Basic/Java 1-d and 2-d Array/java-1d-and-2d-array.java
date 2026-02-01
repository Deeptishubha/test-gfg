class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
         ArrayList<Integer> result=new  ArrayList<Integer>();
        //2d array
        int sum=0,max=b[0];
        for(int i=0;i<n;i++){
              sum=sum+a[i][i];
              if(b[i]>max){
                  max=b[i];
              }
         }
        result.add(sum);
        result.add(max);
        return result;
    }
}
