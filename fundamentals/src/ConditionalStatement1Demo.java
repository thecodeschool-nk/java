public class ConditionalStatement1Demo {

    public static void main(String[] args) {
        /*if (10 > 20) {
            System.out.println("10 is greater than 20");
            System.out.println("statement above executed.");
        } else {
            System.out.println("10 is not greater than 20");
        }*/

        /*int a = 100, b = 100;

        if (a > b) {
            System.out.println("a is greater than b");
            System.out.println("statement above executed.");
        } else if (10 == 20) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("a is lesser than b");
        }*/

        int a = -100, b = 100;

        if (a > 0 && b > 0) {
            if (a > b) {
                System.out.println("a is greater than b");
                System.out.println("statement above executed.");
            } else if (10 == 20) {
                System.out.println("a is equal to b");
            } else {
                System.out.println("a is lesser than b");
            }
        } else {
            System.out.println("either a or b or both are negative/zero");
        }
    }
}
