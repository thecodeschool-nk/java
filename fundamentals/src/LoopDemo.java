public class LoopDemo {
    public static void main(String[] args) {

        long num = 18;
        System.out.println(factorial(num));

        int number = 18;
        printTable(number);
    }

    private static void printTable(int number) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }
    }

    private static long factorial(long number) {
        if (number == 1 || number == 0) {
            return 1;
        }

        long result = 1;

/*        while (number > 1) {
            result = result * number;
//            result *= number;
            number--;
            // number = number - 1;
        }*/

        do {
            result = result * number;
//            result *= number;
            number--;
            // number = number - 1;
        } while (number > 1);

        return result;
    }
}
