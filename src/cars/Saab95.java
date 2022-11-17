package cars;
import java.awt.*;

public class Saab95 extends Car {

    // Model attributes
    private boolean turboOn;

    // Constructor
    public Saab95() {
        
        super(2, 125.0, Color.red, "saab95");
        turboOn = false;

    }

    // Methods
    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }

    protected double speedFactor() {
        double turbo = 1;
        if (turboOn)
            turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

}
