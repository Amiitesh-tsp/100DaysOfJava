import java.util.Scanner;
public class userInput {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = scan.nextLine();
        System.out.println("What is your age?: ");
        int age = scan.nextInt();
        scan.nextLine();
        System.out.println("What is your height?: ");
        float height = scan.nextFloat();
        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("You are "+height+" cm tall");

    }
}
