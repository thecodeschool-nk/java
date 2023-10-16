package exception;

public class MyExceptionDemo {
    public static void main(String[] args) {
        divide(10, 0);
    }

    private static int divide(int i, int i1) {

        if (i1 == 0) {
            throw new MyException("divide by zero");
        }
        return i / i1;
    }
}

class MyException extends IllegalArgumentException {

    public MyException() {
        super();
    }

    public MyException(String message) {
        super("MyException occurred: " + message);
    }

    public MyException(String message, Throwable t) {
        super(message, t);
    }
}
