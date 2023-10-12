import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
      System.out.println("Enter your name");
    String name1 = "Rajveer";
      String name2 = scanner.nextLine();
      if(name1.equals(name2))
      {
        System.out.println("The names are the same");
      }
      else
      {
        System.out.println("The names are different");
      }
      scanner.close();
    }
}