public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Welcome");
        System.out.println(stringBuilder.capacity());//default + length of string = 16 + 7 = 23

        //append
        stringBuilder.append(" Home");
        System.out.println(stringBuilder.toString());//print/println() implicitly calls toString method on object

        //insert
        stringBuilder.insert(8, "to ");
        System.out.println(stringBuilder);

        //replace
        stringBuilder.replace(11, 16, "Java");
        System.out.println(stringBuilder);

        //delete
        stringBuilder.delete(8, 11);
        System.out.println(stringBuilder);

        //reverse
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        //capacity
        stringBuilder.reverse();
        System.out.println(stringBuilder.capacity());
        stringBuilder.insert(8, "to ");
        stringBuilder.append(". This is another line.");
        System.out.println(stringBuilder.capacity());//newCapacity = (oldCapacity * 2) + 2
    }
}
