import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Number of people: ");
    int number = scanner.nextInt();
    
    int maxAge = 0;
    int sumAge = 0;
    for (int i = 1; i <= number; i++ ) {
      System.out.println("Person number " + i);
      
      System.out.print("First name: ");
      String firstName = scanner.next();
      
      System.out.print("Last name: ");
      String lastName = scanner.next();
      
      System.out.print("Age: ");
      int age = scanner.nextInt();
      
      sumAge += age;
      
      //maxAge = Math.max(age(i));
      if ( age > maxAge ) {
        maxAge = age;
      }
      
      System.out.print("Height (m): ");
      double height = scanner.nextDouble();
      
      System.out.print("Weight (kg): ");
      double weight = scanner.nextDouble();
      
      Person.printData(firstName, lastName, age, height, weight); 
    }
    
    System.out.println("Age of oldest person: " + maxAge + "."); 
    
    int averageAge = sumAge / number;
    System.out.println("Average age: " + averageAge + ".");
    
  }
}
