public class Main {
    public static void main(String[] args){
        /*
        Overloaded method = Overloaded method means that the methods have the same name but
        have different parameters.
         */
        int x = mul(2, 2);
        System.out.println(x);
        int y = mul(2, 2, 2);
                System.out.println(y);


    }
    static int mul(int a, int b){
        System.out.println("This is first overloaded method");
        return a * b;
    }
    static int mul(int a, int b, int c){
        System.out.println("This is the second overloaded method");
        return a * b * c;
    }
}
