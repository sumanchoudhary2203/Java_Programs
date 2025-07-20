import java.util.Scanner;
public class Implementing_a_Simple_Calculator {
    public static void main(String[] ags){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Enter operation(+,-,*,/");
        char operation = scanner.next().charAt(0);
        double result;
        switch(operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default: throw new IllegalArgumentException("Invalid operation");
        }
        System.out.println("Result: "+ result);
    }
}
