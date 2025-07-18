import java.util.Arrays;
public class Merge_Two_Arrays {
    public static void main(String[] args){
        int[] arr1= {1,2,4};
        int[] arr2= {6,7,9,3};
        int[] merged = new int[arr1.length +arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        System.out.println(Arrays.toString(merged));
    }
}
