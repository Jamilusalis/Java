class Main {
  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle();
    bicycle.setName("Bianchi");
    bicycle.setColor("Green");
    
    System.out.println("【Bicycle Info】");
    bicycle.printData();
    // System.out.println("Distance: " + bicycle.getDistance() + "km");
    System.out.println("-----------------");
    bicycle.setDistance(10);
    bicycle.run(10);
    
  }
}