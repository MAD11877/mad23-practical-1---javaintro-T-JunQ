import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int[] arr = new int[num];
    
    
    while (num>0)
      {
        int inArr = in.nextInt();
        int i = 0;
        arr[num-1] = inArr; 
        num--;
      }

    int max = 0;
    int repeat = 0;
    for(int i: arr)
      {
        int count = 0;
        for(int j:arr)
          {
            if (i==j){
              count++;
            }
            if (count>max)
            {
              max = count;
              repeat = i;
            }
          }
      }
    System.out.println(repeat);
    
  }
}
