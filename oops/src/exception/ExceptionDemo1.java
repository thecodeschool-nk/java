package exception;

public class ExceptionDemo1 {

    public static void main(String[] args) {
        Integer a = 10, b = null;

//        int result = a / b;

        int result = divide(a, b);
        System.out.println(result);
    }


    private static int divide(Integer a, Integer b) {
        int result = 0;

        /*try {
            result = a / b;
        } catch (ArithmeticException | NullPointerException e) {
            // log important information, cause of exception, stacktrace
            // housekeeping

            System.out.println(e.getMessage());
        } finally {
            System.out.println("After exception");
        }*/

        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            // log important information, cause of exception, stacktrace
            // housekeeping

            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  finally {
            System.out.println("After exception");
        }


        return result;
    }
}
