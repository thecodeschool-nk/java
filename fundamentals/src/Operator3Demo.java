public class Operator3Demo {

    public static void main(String[] args) {
        int a = 200, b = 1200, c = 45;

        //the greatest number among 3 given number
//            false  AND false
        // short-circuit
        if (a > b & a > c) {
            System.out.println(a + " is greatest");
        } else if (b > a & b > c) {
            System.out.println(b + " is greatest");
        } else {
            System.out.println(c + " is greatest");
        }
    }
}
