public class PassByValueDemo {
    public static void main(String[] args) {
        /*PassByValueDemo passByValueDemo = new PassByValueDemo();
        PassByValueDemo passByValueDemo1 = passByValueDemo;

        System.out.println(passByValueDemo instanceof PassByValueDemo);
        System.out.println(passByValueDemo instanceof Object);

        System.out.println(passByValueDemo.hashCode());
        System.out.println(passByValueDemo1.hashCode());*/

        // pass by value for primitives
        int a = 5, b = 10;// a = 5, b = 10 --> 2 memories
        System.out.println(a);
        System.out.println(b);
        method1(a,b);
        System.out.println("After method1 call, a value(in main): "+a);//memories 2

        Employee e = null;
        Employee employee = new Employee("David");// employee = reference (object) --> memory location 1, references = 1
        method2(employee);
        System.out.println("Employee name: " + employee.getName());
    }

    private static void method2(Employee anotherReference) {//memories=1, references=2
        System.out.println(anotherReference.getName());
        anotherReference.setName("John");
        System.out.println("Employee name after modification: " + anotherReference.getName());
    }

    private static int method1(int a, int b) {//pass by value ---> total memories --> 4
        System.out.println("Received a value: "+a);
        a = 20;
        System.out.println("After modification a value: "+a);

        return 0;
    }


    /*
    Memory representation
    Line 13 -->
    scoped main {
        a = 5
        b = 10
    }

    Line 31 -->
    scoped method1 {
        X a = 5
        a = 20
        b = 10
    }X

    //Stack - local variables, references

     */

    /*
    Memory representation
    Line 20 -->
    scoped main {
        employee = reference1
    }

    Line 25 -->
    scoped method2 {
        employee = reference2
    }X

    Heap ---> [object]

     */
}
