public class Arrays2D {
    public static void main(String[] args){
        String[][] things = {
                {"Orange", "Apple", "Peach"},
                {"Lion", "Tiger", "Hyena"},
                {"Car", "Bike", "Bicycle"}
        };
        for(int i = 0; i<things.length; i++){
            System.out.println();
            for(int j = 0; j<things[i].length; j++){
                System.out.print(things[i][j]+ " ");
            }
        }
    }
}
