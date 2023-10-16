package database.subpackage;

public class EmployeeAccessSpecifierDemo {

    public static void main(String[] args) {
        Employee employee = new Employee("Mac");
//        employee.setId(1000);
//        employee.setName("Mac");
        employee.setCity("Bangalore");
        employee.setSalary(111111.0f);

//        employee.phoneNumber = "";
//        employee.someMethod();

        employee.country = "India";

        employee.displayEmployee();

        Employee employee1 = new Employee("Jack");
        employee1.displayEmployee();
        employee1.department = "IT";

    }
}

class Employee {
    private static long idSequence = 1000;
    private long id;
    private String name;
    private String city;
    private String phoneNumber;
    private float salary;
    String country;
    protected String department;

    public Employee(String name) {
        this.id = idSequence;
        this.idSequence = this.idSequence + 1;
        this.name = name;
    }

    public long getId() {
        return id;
    }

//    public void setId(long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("id: "+ id + " name: " + name);
    }

    private void someMethod() {
        System.out.println("somemethod");
    }
}