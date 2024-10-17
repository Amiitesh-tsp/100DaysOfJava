import java.util.Scanner;
public class Prime_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int num = scan.nextInt();

        if(num>1) {
          boolean isPrime = true;
          for(int i=2; i<num/2; i++) {
              if(num%i == 0) {
                  isPrime = false;
                  System.out.println(num + " is not a prime number");
                  break;
              }
          }
          if(isPrime){
            System.out.println(num + " is a prime number");
          }
        }
        else {
          System.out.println(num + " is not a prime number");
        }
    }
}
