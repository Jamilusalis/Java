class Main {
  public static void main(String[] args) {
    // Assign a string to the name variable
    String name = "Jamilu Salisu";
    
    // Assign an integer to the age variable
    int age = 21;
    
    // Assign a double to the height variable (i.e. 1.6)
    double height = 1.75;
    
    // Assign a double to the weight variable (i.e. 50.0)
    double weight = 52.0;
    
    // Calculate the BMI and assign it into the bmi variable
    double bmi = weight / height / height;
    
    // Print name, age, height, weight, and BMI
    System.out.println("My name is " + name);
    System.out.print("I am " + age + " years old");
    System.out.println("My height is " + height + "meters");
    System.out.println("My weight is " + weight + "kilograms");
    System.out.println("My BMI is " + bmi);
    
    
  }
}
