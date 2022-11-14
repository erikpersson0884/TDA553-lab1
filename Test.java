import static java.lang.System.out;
import static java.lang.System.in;
import  java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        Saab95 saab1 = new Saab95();
        Volvo240 volvo1 = new Volvo240();
        saab1.setTurboOn();
        Scanner sc = new Scanner(in);

        while (true) {
                volvo1.gas(1);
                saab1.gas(1);
            out.println("Volvo speed: " + volvo1.getCurrentSpeed());
            out.println("Saab speed: " + saab1.getCurrentSpeed());

            if (volvo1.getCurrentSpeed() >= 100) {
                break;
            }

        }

        }

    }
