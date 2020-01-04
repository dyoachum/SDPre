import java.util.Scanner;

public class Objective2Lab4{
    public static void main(String[] args) {
      String name;
      int num1, num2, num3;
      double average;

      Scanner input = new Scanner (System.in);

      System.out.println("Enter 3 numbers to average");
      num1 = input.nextInt();
      num2 = input.nextInt();
      num3 = input.nextInt();


      input.close();

      average = (double) (num1+num2+num3)/3;

      System.out.println (" The average of these numbers is " + average);
    }
}
