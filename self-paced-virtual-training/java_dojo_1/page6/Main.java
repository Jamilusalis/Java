import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("First name: ");
    String firstName = scanner.next();
    
    System.out.print("Last name: ");
    String lastName = scanner.next();
    
    System.out.print("Age: ");
    int age = scanner.nextInt();
    
    System.out.print("Height (m): ");
    double height = scanner.nextDouble();
    
    System.out.print("Weight (kg): ");
    double weight = scanner.nextDouble();
    
    printData(firstName, lastName, age, height, weight);
  }
  
  public static void printData(String firstName, String lastName, int age, double height, double weight) {
    System.out.println("My name is " + fullName(firstName, lastName) + ".");
    System.out.println("I am " + age + " years old.");
    
    if (age >= 18) {
      System.out.println("I am an adult.");
    } else {
      System.out.println("I am not an adult.");
    }
    System.out.println("I am " + height + "m tall.");
    System.out.println("I weigh " + weight + "kg.");
  }
  
  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }
}
