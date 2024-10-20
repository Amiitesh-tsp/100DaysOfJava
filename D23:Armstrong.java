import java.lang.Math;
import java.util.Scanner;
public class Armstrong {
    static boolean armstrong(int n){
      int temp, digits=0, l=0, sum=0;
      temp=n;

      while(temp>0){
        temp = temp/10;
        digits++;
      }
      temp = n;
      while(temp>0){
        l = temp%10;
        sum += (Math.pow(l, digits));
        temp = temp/10;
      }
      if(n==sum){
        return true;
      }
      else return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int num = scan.nextInt();
        
        if(armstrong(num)){

          System.out.println("Yes it is a armstrong number");
        }
        else{
          System.out.println("No the number is not a armstrong");
        }
    }
}
