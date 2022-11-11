import static java.lang.System.out;
import static java.lang.System.in;

public class Test {
    
    public static void main(String[] args) {
        Saab95 saab1 = new Saab95();
        Volvo240 volvo1 = new Volvo240();
        for (int i = 0; i < 100; i++) {

            out.print(saab1.getX());
            out.println("  " + saab1.getY());
            saab1.gas(5);

            if (i % 3 == 0) {
                saab1.turnLeft();
            }
            else {
                saab1.turnRight();
            }
            saab1.move();
            

        }

    }

}
