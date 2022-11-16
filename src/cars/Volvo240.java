import java.awt.*;

public class Volvo240 extends Car {

    // Model attributes
    private final static double trimFactor = 1.25;

    // Constructor
    public Volvo240() {
        super(4, 100.0, Color.black, "Volvo240");
    }

    // Methods
    public double speedFactor() {
        return getEnginePower() * 0.01 * trimFactor;
    }

}
