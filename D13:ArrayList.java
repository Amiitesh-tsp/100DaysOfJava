import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(10);
        num.add(15);
        num.add(20);
        num.add(25);

        for(int i=0; i<num.size(); i++) System.out.println(num.get(i));
    }
}
