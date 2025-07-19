public class Second_largest_element_in_array {
    public static void main(String[] args){
        int[] arr = { 12,34,8,234,2,67};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num:arr){
            if(num>first){
                second=first;
                first = num;

            }
            else if (num>second&&num !=first){
                second=num;
            }
        }
        System.out.println(second);
    }
}
