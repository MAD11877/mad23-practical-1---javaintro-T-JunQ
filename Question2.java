import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    System.out.println("Enter Height (M):");
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
    System.out.println("Enter Weight (KG):");
    double weight = in.nextDouble();

    System.out.println(weight / (height*height));
  }
}
