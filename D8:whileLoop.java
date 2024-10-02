import java.util.Scanner;
public class logicalOperator {
    public static void main(String[] args){
        // Using while loop in Java
        int i = 10;
        while (i>=0){
            System.out.println(i);
            i--;
        }
        System.out.println("The while loop is executed");
        // Using do-while loop
        Scanner scanner = new Scanner(System.in);
        String name = "";
        do { // The do-while loops executes the while loop once even of the condition is false
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }while(name.isBlank());

        System.out.println("The do-while loop is executed");
    }
}
