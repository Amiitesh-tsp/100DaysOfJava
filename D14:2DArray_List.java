import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        //Creating 2D array list and retrieving individual elements from them
       ArrayList<ArrayList<String>> restaurant  = new ArrayList();
       ArrayList<String> beverage = new ArrayList();
       beverage.add("Coffee");
       beverage.add("Tea");
       beverage.add("Soda");

       ArrayList<String> food = new ArrayList();
       food.add("Pizza");
       food.add("Dosa");
       food.add("Sandwich");

       restaurant.add(beverage);
       restaurant.add(food);
       //To print the whole list
        System.out.println(restaurant);
       //To retrieve a array list from teh 2D array list
        System.out.println(restaurant.get(0));
       //To retrieve an element from the array list inside the 2D array list
        System.out.println(restaurant.get(0).get(0));
    }
}
