import java.util.Scanner; 

class Main {
  public static void main(String[] args) {

Scanner value = new Scanner(System.in);


System.out.println("Enter First Number:");
int num1 = value.nextInt(); 
System.out.println("Enter Second Number:");
int num2 = value.nextInt(); 
System.out.println("Enter Third Number: ");
int num3 = value.nextInt(); 

if ((num1 < num2) && (num1 < num3)) {
    System.out.println(num1 + " is the smallest number"); 
} else if ((num2 < num1) && (num2 < num3)) {
    System.out.println(num2 + " is the smallest number");
} else if ((num3 < num1) && (num3 < num2)) {
    System.out.println(num3 + " is the smallest number");
} else {
    System.out.println("2 of the numbers are the same, try making them different."); 
}












  }
}