public class Operator1Demo {
    public static void main(String[] args) {
        int a  = 10;
        System.out.println(a);

        a = a + 100;
        System.out.println(a);

        a += 100;
        System.out.println(a);//210
        System.out.println(a++);//210 -->after print a = 211
        System.out.println(++a);//211 + 1 --> 212

        System.out.println("final value of a: " + a);

    }
}
