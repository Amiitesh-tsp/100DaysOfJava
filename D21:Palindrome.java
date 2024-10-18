import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r;
        int sum = 0;
        int temp;
        System.out.println("Enter the number to be printed: ");
        int n = scan.nextInt();

        temp = n;
        while(n>0){
          r = n%10;
          sum = (sum*10)+r;
          n = n/10;  
        }
        if(temp==sum)
          System.out.println("Palindrome number");

        else
          System.out.println("Not Palindrome number");
        
    }
}
