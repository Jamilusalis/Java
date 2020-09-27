public class Main {
  public static void main(String[] args) {
    // Rewrite the calls to the printData and fullName methods
    // printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
   // printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
   
    String name = Person.fullName("Kate", "Jones");
    Person.printData(name, 27, 1.6, 50.0);
    
    name = Person.fullName("John", "Christopher", "Smith");
    Person.printData(name, 65, 1.75, 80.0);
  }
}
