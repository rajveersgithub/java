import java.util.Scanner; 

class Main {
  public static void main(String[] args) {

Scanner value = new Scanner(System.in);

System.out.println("Problem 1: 3x3, Answer Below: "); 

int math1 = value.nextInt(); 

if (math1 == 9) {
  System.out.println("You got it right!"); 
} else {
  System.out.println("Incorrect, Score 0/3, Try Again!"); 
  System.exit(1); 
}

System.out.println("Problem 2: 7 x 8, Answer Below"); 
int math2 = value.nextInt();

if (math2 == 56) {
  System.out.println("Correct! Get ready for the last question"); 
} else {
  System.out.println("Incorrect, Score: 1/3, Try Again!"); 
  System.exit(1); 
}

System.out.println("Final Problem: 90920138098501 * 0"); 

int math3 = value.nextInt(); 

if (math3 == 0) {
  System.out.println("Nice! You got all the question's right with a score of 3/3"); 
} else {
  System.out.println("Incorrect, Score 2/3, Try Again!"); 
  
}

  } 

  }