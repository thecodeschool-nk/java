package polymorphisms;

public class PolymorphismDemo1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(10, 10));

        System.out.println(calculator.sum(10.0f, 10));

        System.out.println(calculator.sum(10, 10, 10));
    }
}

class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public float sum(float a, float b) {
        return a + b;
    }

    protected int sum(int a, int b, int c) {
        return a + b + c;
    }
}
