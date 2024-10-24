import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    int sum = 0;
    String continueInput;

    do {
      System.out.println("Type a number:");
      int num = myObj.nextInt();  // Read user input
      sum += num;  // Add number to sum

      System.out.println("Do you want to add another number? (yes/no):");
      continueInput = myObj.next();  // Read user choice
    } while (continueInput.equalsIgnoreCase("yes"));

    System.out.println("Total sum is: " + sum);  // Print the total sum
  }
}
