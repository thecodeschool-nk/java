public class MobileTest {
    public static void main(String[] args) {
        Mobile iphone13Rushi = new Mobile();
        Mobile iphone13Nihar = new Mobile();
        Mobile iphone13Niraj = new Mobile();

    }
}

class Mobile {

    int currentVolume = 30;//one per object
    static final int volumeThreshold = 100;//one per class

    //attributes
    //setters/getters
    //behaviors

    public void makeACall(String phoneNumber) {
        System.out.println("Making a call to the number: " + phoneNumber);
    }

    public void playGame(String nameOfGame) {
        System.out.println("game started");
        increaseVolume(10);
        increaseVolume(10);
        increaseVolume(10);
        increaseVolume(10);
        increaseVolume(10);
        increaseVolume(10);
        increaseVolume(10);
        increaseVolume(10);
    }

    public int increaseVolume(int increaseBy) {
//        check if currentVolume below volumeThreshold
//        then do execute -->
            System.out.println("volume increased by " + increaseBy);
//        otherwise skip increasing volume

        return currentVolume;
    }
}
