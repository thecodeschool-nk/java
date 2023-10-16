import java.io.Console;
import java.util.Scanner;

class Calculator {
    public int addition(int num1, int num2) {
        return num1 + num2;
    }

    // subtraction
    // multiplication
    // division
}

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = Integer.parseInt(scanner.next());
        System.out.print("Enter another number: ");
        int number2 = Integer.parseInt(scanner.next());
//        int result = calculator.addition(10, 20);
        int result = calculator.addition(number1, number2);
        System.out.println(result);
    }
}
