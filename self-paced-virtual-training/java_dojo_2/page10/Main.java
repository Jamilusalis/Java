import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle();
    bicycle.setName("Bianchi");
    bicycle.setColor("Green");
    
    System.out.println("【Bicycle Info】");
    bicycle.printData();
   
    System.out.println("-----------------");
    System.out.print("Enter distance to move: ");
    Scanner scanner = new Scanner(System.in);
    int distance = scanner.nextInt();
    bicycle.run(distance);
    
    System.out.println("=================");
    Car car = new Car();
    car.setName("Ferrari");
    car.setColor("Red");
    
    System.out.println("【Car Info】");
    car.printData();
    
    System.out.println("-----------------");
    System.out.print("Enter distance to move: ");
    distance = scanner.nextInt();
    car.run(distance);
    
    System.out.println("-----------------");
    System.out.print("Enter amount to refuel: ");
    int litter = scanner.nextInt();
    car.charge(litter);
  }
}