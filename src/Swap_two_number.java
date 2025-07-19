public class Swap_two_number {
    public static void main(String[] args){
        int a = 10, b =9;
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a: " + a + ",b: " + b);
    }
}
