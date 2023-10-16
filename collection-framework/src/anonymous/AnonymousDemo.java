package anonymous;

public class AnonymousDemo {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print(String str1, String str2) {
                System.out.println(str1 + str2);
            }
        };
        printable.print("Hello", "World");

        Printable printable2 = (str1, str2) -> {
            System.out.println(str1);
            System.out.println(str2);
        };


        printable2.print("Hello", "World");

    }
}

@FunctionalInterface
interface Printable {
    void print(String str1, String str2);
}

class ConcretePrintable implements Printable {
    @Override
    public void print(String str1, String str2) {
        System.out.println(str1 + str2);
    }
}
