package Cars;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        Volvo240 myVolvo = new Volvo240(100, Color.blue, 0, 0);
        Saab95 yourSaab = new Saab95(125, Color.red, 10, 10);

        System.out.println(myVolvo.getX());
        System.out.println(myVolvo.getY());
        myVolvo.gas(0.5);

        myVolvo.turnRight();

        myVolvo.move();
        System.out.println(myVolvo.getX());
        System.out.println(myVolvo.getY());

        myVolvo.turnLeft();
        myVolvo.turnLeft();

        myVolvo.turnLeft();
        myVolvo.turnLeft();
        
        myVolvo.move();
        System.out.println(myVolvo.getX());
        System.out.println(myVolvo.getY());

        myVolvo.startEngine();
        System.out.println(myVolvo.getCurrentSpeed());
        myVolvo.gas(0.5);
        System.out.println(myVolvo.getCurrentSpeed());

        myVolvo.gas(1);
        System.out.println(myVolvo.getCurrentSpeed());

        myVolvo.gas(0.5);
        System.out.println(myVolvo.getCurrentSpeed());

        myVolvo.brake(1);
        System.out.println(myVolvo.getCurrentSpeed());
     
        myVolvo.brake(1);
        System.out.println(myVolvo.getCurrentSpeed());
    }
}
