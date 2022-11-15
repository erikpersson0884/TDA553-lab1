import java.awt.*;

public class Volvo240 extends Car{

    // Model attributes
    private final static double trimFactor = 1.25;
    
    // Constructor
    public Volvo240(){
        setNrDoors(4);
        setColor(Color.black);
        setEnginePower(100);
        setModelName("Volvo240");
        setDirectionIndex(0);
        stopEngine();
        setX(0);
        setY(0);
    }
    
    // Methods
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }


}
