public class Find_largest_Elements_in_Array {
    public static void main(String[] args){
        int[] arr = {1,3,4,2,8,90};
        int largest = arr[0];
        for (int num:arr){
            if(num>largest){
                largest = num;
            }
        }
        System.out.println(largest);
    }
}
