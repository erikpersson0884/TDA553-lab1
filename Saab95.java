import java.awt.*;

public class Saab95 extends Car {

    // Model attributes
    private boolean turboOn;

    // Constructor
    public Saab95() {
        setNrDoors(2);
        setColor(Color.red);
        setEnginePower(125);
        setModelName("Saab95");
        setDirectionIndex(0);
        turboOn = false;
        stopEngine();
        setX(0);
        setY(0);
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
