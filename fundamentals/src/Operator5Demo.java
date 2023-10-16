
public class Operator5Demo {
    public static void main(String[] args) {
        String day = "Saturday";
        String office = day.equals("Tuesday") ? "office" : "holiday";

        System.out.println(office);

        // == can be used to compare value of primitives
        // in case of string use .equals()
        // if you want to compare if objects are meaningfully same

        Employee employee = new Employee("Mathew");

        Employee anotherEmployee = employee;

        System.out.println(employee == anotherEmployee);

        String str1 = "Welcome";
        String str2 = new String("Welcome");

        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);

    }

}

