public class SquareRoot {

  public static void main(String[] args) {
    double number = Double.valueOf(args[0]).doubleValue();
    double root   = Math.sqrt(number);
    System.out.println("The square root of " + number +
      " is " + root);
  }
}