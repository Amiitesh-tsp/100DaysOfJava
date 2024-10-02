import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter the rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter the columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter the symbol to use: ");
        symbol = scanner.next();

        for(int i=1; i<=rows; i++){
            System.out.println();
            for(int j=1; j<=columns; j++){
                System.out.print(symbol);
            }
        }
    }
}
