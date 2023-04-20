import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();

    while (num > 0){
      String str = "*";
      int i = num;
      
      while (i-- > 0){
        System.out.print(str);
      }
      
      System.out.println();
      num--;
    
  }
}
