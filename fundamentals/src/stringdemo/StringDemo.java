package stringdemo;

import java.math.BigInteger;

public class StringDemo {
    public static void main(String[] args) {
        Integer integer = new Integer(100);
        byte []arr = new byte[5];
        BigInteger bigInteger = new BigInteger(arr);
        bigInteger.setBit(100);

        String str1 = new String("Hello");
        System.out.println(str1);

    }
}
