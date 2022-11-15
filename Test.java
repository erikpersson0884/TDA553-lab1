import static java.lang.System.out;
import static java.lang.System.in;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Saab95 saab1 = new Saab95();
        Volvo240 volvo1 = new Volvo240();
        
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(30,30,300,300);
        frame.setVisible(true);

    }

}
