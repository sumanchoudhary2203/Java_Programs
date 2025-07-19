public class GCD_of_two_number {
    public static void main(String[] ars){
        int a = 60, b = 48;
        while (b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println(a);
    }
}
