public class ConditionalStatement2Demo {

    public static void main(String[] args) {
        /*int age = 25;

        switch (age) {
            case 18:
                System.out.println("Drink Milk");
                break;

            case 25:
                System.out.println("Drink tea");
                break;

            case 70:
                System.out.println("Have medicine");
                break;

            default:
                System.out.println("your choice should be anything out of [18, 25, or 70]");
        }*/

//        private static final int VOLUME_THRESHOLD = 100;

       /* String name = "Tom";

        switch (name) {
            case "Nihar":
                System.out.println("Nihar");
                break;
            case "Rushi":
                System.out.println("Rushi");
                break;
            case "Lahari":
                System.out.println("Lahari");
                break;
            default:
                System.out.println("someone unknown");
        }*/

        STATE_OF_LIQUID currentState = STATE_OF_LIQUID.COLD;

        switch (currentState) {
            case WARM:
                System.out.println("Warm");
                break;
            case COLD:
                System.out.println("Cold");
                break;
            case NORMAL:
                System.out.println("Normal");
                break;
        }

    }

    enum STATE_OF_LIQUID {
        WARM,
        COLD,
        NORMAL
    }
}
