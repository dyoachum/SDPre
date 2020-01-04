import java.util.Scanner;

public class Objective2Lab5{
  public static void main( String[] args){

    Scanner keyboard = new Scanner(System.in);

    System.out.println(" Enter the length of Side A:");
    double sideA = keyboard.nextDouble();

    System.out.println("Enter the length of Side B:");
    double sideB = keyboard.nextDouble();

    double sideC = Math.sqrt((sideA*sideA) + ( sideB*sideB));

    System.out.println("The hypotenuse of a triangle with sides of "+ (sideA) + " and " + (sideB) +" is: " + sideC);

  }
}
