import java.util.Scanner; 

class Main {
  public static void main(String[] args) {

Scanner value = new Scanner(System.in); 

System.out.println("Enter Number 1: "); 

int num1 = value.nextInt(); 

System.out.println("Enter Number 2"); 

int num2 = value.nextInt(); 

if (num1 > num2) {
  System.out.println(num1 + " is greater than " + num2); 
} else if (num1 < num2) {
  System.out.println(num1 + " is less than " + num2); 
} else {
  System.out.println(num1 + " is equal to " + num2); 
}



  } 
}