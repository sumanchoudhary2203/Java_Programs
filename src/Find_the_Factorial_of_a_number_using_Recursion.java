public class Find_the_Factorial_of_a_number_using_Recursion {
    public static void main(String[] args){
        int num = 5;
        System.out.println(factorial(num));
    }
    static  int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);

    }
}
