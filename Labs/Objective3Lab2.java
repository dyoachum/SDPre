import java.util.Scanner;

public class Objective3Lab2{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.print("Whats your name? ");
    String userInput = scan.nextLine();

    System.out.println("Hello " + userInput );
  }
}
