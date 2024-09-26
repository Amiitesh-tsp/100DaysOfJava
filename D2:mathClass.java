public class mathClass {
    public static void main(String[] args){
        double a = -3.1456;
        double b = 2.89758;
        //Math.max() to find the greatest number between the two
        double c = Math.max(a,b);
        System.out.println("The greatest number is: "+c);
        //Math.min() to find the smallest number between the two
        double d = Math.min(a,b);
        System.out.println("The smallest number is: "+d);
        //Math.abs() returns the positive value of the number in case if the number is negative
        double e = Math.abs(a);
        System.out.println("The absolute of the number is: "+e);
        //Math.ceil() and Math.floor() is to find the highest and lowest rounded off number respectively
        double f = Math.ceil(b);
        System.out.println("The ceil of the number is: "+f);
        double g = Math.floor(b);
        System.out.println("The floor of the number is: "+g);

    }
}
