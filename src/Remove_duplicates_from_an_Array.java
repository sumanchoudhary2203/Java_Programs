import java.util.HashSet;

public class Remove_duplicates_from_an_Array {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,2};
        HashSet<Integer>set = new HashSet<>();
        for (int num:arr){
            set.add(num);
        }
        System.out.println(set);
    }
}
