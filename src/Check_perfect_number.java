public class Check_perfect_number {
    public static void main(String[] args){
        int num = 496, sum =0;
        for (int i = 1; i<=num/2; i++ ){
            if (num%i==0){
                sum +=i;
            }
        }
        System.out.println(num==sum);
    }
}



