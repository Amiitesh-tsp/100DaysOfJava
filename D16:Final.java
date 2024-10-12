public class Final{
    public static void main(String[] args) {
        //The final keyword is used to make the particular variable non-changeable
        int a = 2;
        b = 3;
        System.out.println("The output of the program is "+a);
        //The error will be generated in the above program since the keyword "final" has not been assigned to the variable "a"

        final int b = 2;
        b = 3;
        System.out.println("The output of the program is "+b);
        //An error will generated since the value of "b" cannot be changed after the use the keyword "final"      
      }
}
