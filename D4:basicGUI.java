//Using JOptinPane a basic I/O GUI is created
import javax.swing.JOptionPane;
public class basicGUI {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Your name is "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");
    }
}
