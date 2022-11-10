import java.awt.*;

public class Main {
    public static void main(String[] args){
        Volvo240 myVolvo = new Volvo240(120, Color.red, 0, 0);
        Saab95 yourSaab = new Saab95(140, Color.blue, 10, 10);

        System.out.println(myVolvo.getX());
        System.out.println(myVolvo.getY());
        myVolvo.gas(10);

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

    }
}
