// This is a program using "not" operator
import java.util.Scanner;
public class logicalOperator {
    public static void main(String[] args){
        // || is the "or" operator
        // && is the "and" operator
        // ! is the "not" operator
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game: Press Q or q to exit the game");
        String answer = scanner.next();
        if(!answer.equals("q") || !answer.equals("Q")){
            System.out.println("You did not quit the game");
        }
        else {
            System.out.println("You quit the game!");
        }
    }
}

// This is a program without the use of "not" operator
import java.util.Scanner;
public class logicalOperator {
    public static void main(String[] args){
        // || is the "or" operator
        // && is the "and" operator
        // ! is the "not" operator
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game: Press Q or q to exit the game");
        String answer = scanner.next();
        if(answer.equals("q") || answer.equals("Q")){
            System.out.println("You quit the game!"); 
        }
        else {
            System.out.println("You did not quit the game");
        }
    }
}
