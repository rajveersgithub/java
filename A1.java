import java.util.Scanner;  // initialize the scanner

class Main {
  public static void main(String[] args) {
  
Scanner value = new Scanner(System.in); //create a scanner

System.out.println("Enter Name: "); //ask the user for the first name

String name = value.nextLine(); //take input from the user

System.out.println("Enter 2nd Name: "); //ask the user for the second name

String name2 = value.nextLine(); //take input from the user

if (name.equals(name2)) {
  System.out.println("Both names are the same!"); //if both names are the same, it will print this
} else  {
  System.out.println("The names are different"); //if the names are different, then it will print this
}

  }
}