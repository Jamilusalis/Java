class Main {
  public static void main(String[] args) {
    // Assign a list of numbers into the numbers variable
    int[] numbers = {1, 4, 6, 9, 13, 16};
    
    int oddSum = 0;
    int evenSum = 0;
    
    // Calculate the sum of odd numbers and the sum of even numbers
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) {
        evenSum += numbers[i];
      }
    }
    
    for (int number: numbers) {
      switch (number % 2) {
        case 1:
          oddSum += number;
      }
    }
    //System.out.println(oddSum);

    System.out.println("The sum of odd numbers: " + oddSum);
    System.out.println("The sum of even numbers: " + evenSum);
  }
}
