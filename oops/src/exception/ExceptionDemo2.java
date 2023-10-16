package exception;

import java.io.FileNotFoundException;

public class ExceptionDemo2 {

    public static void main(String[] args) throws Exception {

        String str = "Hello";

        int result = parseIntFromString(str);
    }


    private static int parseIntFromString(String str) throws Exception {
        if (strNotDigit(str)) {
            throw new Exception();
        }

        return Integer.parseInt(str);
    }

    private static boolean strNotDigit(String str) {

        return true;
    }
}
