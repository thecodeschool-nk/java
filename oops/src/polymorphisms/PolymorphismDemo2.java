package polymorphisms;

import java.util.Date;

public class PolymorphismDemo2 {

    public static void main(String[] args) {
        Employee employee = new ITEngineer();
        employee.work();
    }
}


class Employee {
    private int empId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private double salary;
    private String departmentName;

    public void work() {
        System.out.println("Employee works");
    }

}

class ITEngineer extends Employee {

    public void work() {
        System.out.println("ITEngineer works");
    }
}
