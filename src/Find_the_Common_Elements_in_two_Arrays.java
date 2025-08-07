import java.util.HashSet;

public class Find_the_Common_Elements_in_two_Arrays {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,5,7,4};
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr1){
            set.add(num);
        }
        for(int num:arr2){
            if(set.contains(num)){
                System.out.println(num+"");
            }
        }
    }
}

