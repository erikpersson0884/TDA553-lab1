import static java.lang.System.out;
import static java.lang.System.in;

public class Test {
    
    public static void main(String[] args) {
        Saab95 saab1 = new Saab95();
        Volvo240 volvo1 = new Volvo240();

        out.println(saab1.getModelName());
        
        out.println(saab1.getCurrentSpeed());
        saab1.gas(10);
        out.println(saab1.getCurrentSpeed());

    }

}
