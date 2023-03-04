import java.util.*;

public class Main {
//  Must be able to run the add, subtract, multiply, divide, fibonacciNumberFinder, and intToBinaryNumber in the terminal.
//  You can assume that all input will be perfectly formatted. No need to account for null input or bad formatting.
//  You do NOT need to support the createUniqueID method
//  Inputs do NOT need to be identical to my examples
  public static void main(String[] args) {
    System.out.println("welcome to the calculator");
    System.out.println("Enter a command:");

    Calculator calculator = new Calculator();

    Scanner kb = new Scanner(System.in);

    while(true) {
      String command = kb.next();
      int left;
      int right;
      int ans;
      switch (command) {
        case "add":
          left = kb.nextInt();
          right = kb.nextInt();
          ans = calculator.add(left, right);
          System.out.println(ans);
          break;
        case "subtract":
          left = kb.nextInt();
          right = kb.nextInt();
          ans = calculator.subtract(left, right);
          System.out.println(ans);
          break;
        case "multiply":
          left = kb.nextInt();
          right = kb.nextInt();
          ans = calculator.multiply(left, right);
          System.out.println(ans);
          break;
        case "divide":
          left = kb.nextInt();
          right = kb.nextInt();
          ans = calculator.divide(left, right);
          System.out.println(ans);
          break;
        case "fibonacci":
          left = kb.nextInt();
          ans = calculator.fibonacciNumberFinder(left);
          System.out.println(ans);
          break;
        case "binary":
          left = kb.nextInt();
          System.out.println(calculator.intToBinaryNumber(left));
          break;
        default:
          return;
      }
    }
  }
}
