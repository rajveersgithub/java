import java.util.Scanner; 

class Main {
  public static void main(String[] args) {

Scanner value = new Scanner(System.in);

System.out.println("What Country are you from? Type your answer below: ");

String country = value.nextLine(); 

if (country.equals("Canada")) {

  System.out.println("What is on Canada's Flag? a) Poutine b) A Beaver c) Maple Leaf d) Maple Syrup | Type a, b, c or d"); 
    String trivia1 = value.nextLine(); 

  if (trivia1.equals("c")) {
    System.out.println("Correct! You know a lot about your country"); 
    System.exit(1); 
  } else {
    System.out.println("Incorrect, you should know more about your country"); 
    System.exit(1); 
  }

} else if (country.equals("Germany")) {

   System.out.println("How do you say hello in german?  a) Hallo b) Bonjour c) Hola d) Ciao | Type a, b, c or d"); 
    String trivia2 = value.nextLine(); 

  if (trivia2.equals("a")) {
    System.out.println("Correct! You know a lot about your country"); 
    System.exit(1); 
  } else {
    System.out.println("Incorrect, you should know more about your country"); 
    System.exit(1); 
  }
  
} else if (country.equals("Italy")) {
   
  System.out.println("What is the tiny country inside italy called? a) Cuba b) Vatican City c) Vaticanty d) United States of America | Type a, b, c or d"); 
    String trivia3 = value.nextLine(); 

  if (trivia3.equals("b")) {
    System.out.println("Correct! You know a lot about your country"); 
    System.exit(1); 
  } else {
    System.out.println("Incorrect, you should know more about your country"); 
    System.exit(1);
  }
} else {
  System.out.println("Sorry, I do not have that region in my database");  
}




  } 

  }