import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    int result = 0;
    String continueInput;

    System.out.println("Choose operation: 'add' or 'subtract':");
    String operation = myObj.next();  // Read user operation choice

    do {
      System.out.println("Type a number:");
      int num = myObj.nextInt();  // Read user input

      if (operation.equalsIgnoreCase("add")) {
        result += num;  // Add number to result
      } else if (operation.equalsIgnoreCase("subtract")) {
        result -= num;  // Subtract number from result
      } else {
        System.out.println("Invalid operation!");
        return;  // Exit if invalid operation is chosen
      }

      System.out.println("Do you want to add another number? (yes/no):");
      continueInput = myObj.next();  // Read user choice
    } while (continueInput.equalsIgnoreCase("yes"));

    System.out.println("Final result is: " + result);  // Print the result
  }
}
