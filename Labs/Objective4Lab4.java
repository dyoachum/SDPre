import java.util.Scanner;
  public class Objective4Lab4{
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number: ");
      userNum = scan.nextInt();

      if (userNum % 2 == 0){
        System.out.println("The number is even");
      }
      else System.out.println("Thenumber is odd");
    }
  }
