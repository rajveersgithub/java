import java.util.Scanner; 

class Main {
	public static void main(String[] args) {

Scanner value = new Scanner(System.in);


System.out.println("Player 1 Choose: ");

String p1 = value.nextLine(); 

System.out.println("Player 2 Choose: ");

String p2 = value.nextLine(); 


if (p1.equals("Rock") && (p2.equals("Paper"))) {     
		System.out.println("Player 2 Wins");
} else if (p1.equals("Rock") && (p2.equals("Scissors"))) {
		System.out.println("Player 1 Wins");
} else if (p1.equals("Rock") && (p2.equals("Rock"))) {
		System.out.println("Tiebreaker");
} else if (p1.equals("Paper") && (p2.equals("Rock"))) {
		System.out.println("Player 1 Wins");
} else if (p1.equals("Paper") && (p2.equals("Paper"))) {
		System.out.println("Tiebreaker");
} else if (p1.equals("Paper") && (p2.equals("Scissors"))) {
		System.out.println("Player 2 Wins");
} else if (p1.equals("Scissors") && (p2.equals("Rock"))) {
		System.out.println("Player 2 Wins");
} else if (p1.equals("Scissors") && (p2.equals("Paper"))) {
		System.out.println("Player 1 Wins");
} else if (p1.equals("Scissors") && (p2.equals("Scissors"))) {
		System.out.println("Tiebreaker");
} else {
		System.out.println("Invalid Input"); 
}







	}
}