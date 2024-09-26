import java.util.Random;
public class randomClass {
    public static void main(String[] args){
        Random random = new Random();
        //random.nextInt() to return a random integer
        int a = random.nextInt(6)+1;
        System.out.println("The random number generated is: "+a);
        //to return a number within a range
        int b = random.nextInt(2, 27);
        System.out.println("The random number generated within a range is: "+b);
        //to return a double
        //returns number between 0 to 1
        double c = random.nextDouble();
        System.out.println("The random double generated is: "+c);
        //to return boolean values
        boolean d = random.nextBoolean();
        System.out.println("The boolean value generated is: "+d);

    }
}
