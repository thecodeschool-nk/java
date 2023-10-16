import java.util.Random;

public class RandomNumberDemo {

    public static void main(String[] args) {
        int size = 5, min = 10, max = 100;

        System.out.print("Math.random - no range ====>");
        for (int i=0; i<size; i++) {
            System.out.print(Math.random() + " ");
        }

        System.out.print("\nMath.random ====>");
        for (int i=0; i<size; i++) {
            int randomNumber = min + (int)(Math.random() * ((max - min) + 1));
            System.out.print(randomNumber + " ");
        }

        Random seedRandom = new Random(min);
        System.out.print("\nRandom.nextInt ====>");
        for (int i=0; i<size; i++) {
            int randomNumber = seedRandom.nextInt(max);
            System.out.print(randomNumber + " ");
        }

        Random random = new Random();
        System.out.print("\nRandom.ints ====>");
        random.ints(size, min, max)
                .forEach(n -> System.out.print(n + " "));
    }
}
