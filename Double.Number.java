//Adding two values using scanner class
import java.util.Scanner;
  class Main {
  public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
    System.out.print("Enter a number:");

    //takes input from keyboard
      Double num1 = input.nextDouble();
    Double num2 = input.nextDouble();
    //print the name
    System.out.println("Number is " + 
(num1+num2));
    //closes the scanner
    input.close();
    


  }
}