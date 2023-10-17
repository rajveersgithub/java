import java.util.Scanner; 

class Main {
  public static void main(String[] args) {

Scanner value = new Scanner(System.in);


System.out.println("Choose your language preference: "); 
System.out.println("1 = English");
System.out.println("2 = French");
System.out.println("3 = German");
System.out.println("4 = Spanish");


int lan = value.nextInt(); 

if (lan == 1) {
    System.out.println("Hello, I hope you are having a great time marking this assignment");   
} else if (lan == 2) {
    System.out.println("Bonjour, j'espère que vous passez un bon moment à noter ce devoir");
} else if (lan == 3) {
    System.out.println("Hallo, ich hoffe, Sie haben viel Spaß beim Bewerten dieser Aufgabe");
} else if (lan == 4) {
    System.out.println("Hola, espero que la estés pasando muy bien marcando esta tarea.");
} else {
    System.out.println("I'm sorry, but I only have 4 languages availible."); 
}

  }
}