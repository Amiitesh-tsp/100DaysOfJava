import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter number of numbers to be printed: ");
      int a = scan.nextInt();
      System.out.println("The Fibonacci series: ");
      int num1 = 0;
      int num2 = 1;
      int next_num = num2;
      System.out.println(num1);
      System.out.println(num2);
      for(int i=0; i<=a; i++){
          System.out.println(next_num);
          num1 = num2;
          num2 = next_num;
          next_num = num1 + num2;
      }

  }
}
