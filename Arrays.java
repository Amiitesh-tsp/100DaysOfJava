public class Arrays {
    public static void main(String[] args){
        String[] cars = new String[4];
        cars[0] = "Hyundai";
        cars[1] = "Ford";
        cars[2] = "Nissan";
        cars[3] = "Porsche";
        for(String car : cars) System.out.println(car); //for loop in a single line

        //To execute for loop normally
        /*
        for(String car : cars){
        System.out.println(car);
        }
         */
    }
}