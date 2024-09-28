import java.util.Scanner;

public class switchJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Physics mark: ");
        int phy = scan.nextInt();

        System.out.println("Enter Chemistry mark: ");
        int chem = scan.nextInt();

        System.out.println("Enter Mathematics mark: ");
        int maths = scan.nextInt();

        System.out.println("Enter Computer Science mark: ");
        int cse = scan.nextInt();

        // Calculate the average correctly
        int avg = (phy + chem + maths + cse) / 4;

        // Use switch case for grades
        switch (avg / 10) {
            case 10, 9:
                System.out.println("S Grade");
                break;
            case 8:
                System.out.println("A Grade");
                break;
            case 7:
                System.out.println("B Grade");
                break;
            case 6:
                System.out.println("C Grade");
                break;
            case 5:
                System.out.println("D Grade");
                break;
            default:
                System.out.println("F Grade");
                break;
        }

        scan.close();
    }
}