package interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();

        dog.canBite();

        dog.canSwim();
    }
}


interface Animal {
    // public abstract are optional
    boolean canBite();

    boolean canSwim();

}


class Dog implements Animal {
    public boolean canBite() {
        System.out.println("can bite");
        return true;
    }

    public boolean canSwim() {
        System.out.println("can swim");
        return true;
    }

}