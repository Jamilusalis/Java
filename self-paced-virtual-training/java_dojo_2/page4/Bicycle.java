class Bicycle {
  private String name;
  private String color;
  private int distance = 0;
  
  public void printData () {
    System.out.println("Name: " + this.name);
    System.out.println("Color: " + this.color);
  }
  
  public void setName (String name) {
    this.name = name;
  }
  
  public void setColor (String color) {
    this.color = color;
  }
  
  public void setDistance (int distance) {
    this.distance = distance;
  }
  
  public String getName () {
    return this.name;
  }
  
  public String getColor () {
    return this.color;
  }
  
  public int getDistance () {
    return this.distance;
  }
}