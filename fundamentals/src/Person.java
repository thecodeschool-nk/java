public class Person {
    String name;
    Integer age;
    float height;
    String complexion;
    String ethinicity;
    String hairStyle;
    String gender;

    /*public Person() {
        name = null;
        age = null;
        height = 0.0f;
        complexion = null;
        ethinicity = null;
        hairStyle = null;
        gender = "Male";
    }*/

    public Person() {}

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.gender = "Male";
    }

    String getName() {
     return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public String getEthinicity() {
        return ethinicity;
    }

    public void setEthinicity(String ethinicity) {
        this.ethinicity = ethinicity;
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        int a = 10;
        this.gender = gender;
    }

    public static void main(String[] args) {
//        Person person1 = new Person();//1 person object
        // new memory according to the class mentioned
        // left hand side person is reference to object memory
        Person person1 = new Person("Rushikesh", 12, "Male");//1 person object

/*        person1.setName("Rushikesh");
        person1.setHeight(6.1f);*/

        System.out.println("Name: " + person1.getName());
        System.out.println("Height: " + person1.getHeight());

        person1 = new Person();//2 person objects

        //                           person object
        //     person1 ---->                  person object

        System.out.println(person1.getName());
        System.out.println(person1.getGender());


/*        String str1 = new String("hello");
        String str2 = "hello";

        Integer i = 10;
        Integer j = new Integer(20);*/



    }
}
