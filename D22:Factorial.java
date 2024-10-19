import java.util.Scanner;
import java.math.BigInteger;

//BigInteger is imported from the math class to handle larger values

public class Factorial {
    public static void main(String[] args) {
        int i;
        BigInteger f = BigInteger.ONE;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check the factorial for: ");
        int num = scan.nextInt();

        
        for(i = 1; i <= num; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println("Factorial of " + num + " is " + f);
    }
}


