public class find_missing_number_in_array {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,8};
        int n = arr.length+1;
        int total = n*(n+1)/2;
        for (int num:arr){
            total -=num;
        }
        System.out.println(total);
    }
}
