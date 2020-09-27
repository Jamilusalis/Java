import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    //accept first name from user
    System.out.print("First name: ");
    String firstName = scanner.next();
    
    //accept last name from user
    System.out.print("Last name: ");
    String lastName = scanner.next();
    
    //accept age from user
    System.out.print("Age: ");
    int age = scanner.nextInt();
    
    //concatenate firstName and lastName
    String fullName = firstName + " " + lastName ;
    
    //print full name
    Person.name(firstName);
    System.out.println("My name is " + fullName + ".");
    
    //print user age
    System.out.println("I am " + age + " years old.");
    
    //print weather is an adult or not based on age
    if (age >= 18 ) {
      System.out.println("I am an adult.");
    } else {
      System.out.println("I am not an adult.");
    }
  }
}
