package association;

public class CompositionDemo {
    public static void main(String[] args) {
        Car car = new Car();
    }
}

class Car {
    Engine engine;
    public Car() {
        engine = new Engine();
    }
}

class Engine {

}


