package arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        Student students[] = new Student[5];
        students[0] = new Student(101, "Vijay", 23);
        students[1] = new Student(102, "Ajay", 27);
        students[2] = new Student(103, "Rushi", 21);
        students[3] = new Student(104, "Lahari", 22);
        students[4] = new Student(105, "Nihar", 24);

        Arrays.stream(students)
                        .forEach(student -> System.out.println(student));

        Arrays.sort(students);

        System.out.println("=====Sorted======");
        Arrays.stream(students)
                .forEach(student -> System.out.println(student));
    }
}

class Student implements Comparable {
    private int rollno;
    private String name;
    private int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Object obj) {
        Student st = (Student) obj;
        if (this.age == st.age)
            return 0;
        else if (this.age < st.age)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
