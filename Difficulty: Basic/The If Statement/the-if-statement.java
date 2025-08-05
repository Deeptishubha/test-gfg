// User function Template for Java
class Solution {
    public static void utility(int number) {
        // Write your if statement below
        if(number>100){
            System.out.println("Big");
        }
        // Write your if statement above
        System.out.println("Number");
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        utility(a);
}
}