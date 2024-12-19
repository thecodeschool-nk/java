package inheritances;

import java.util.Date;
import java.util.Random;

public class InteritanceDemo {

    public static void main(String[] args) {
        Animal dog = new Dog();
    }

}

interface Animal {

}

interface Creature {

}

interface ThreatToHuman extends Animal, Creature {

}

/*class Dog extends Random, Date {

}*/



class Dog implements Animal, Creature {

}

class Tiger implements Animal, ThreatToHuman {

}
