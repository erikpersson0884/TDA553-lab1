import java.awt.*;

public class Volvo240 extends Car implements Movable{

    public final static double trimFactor = 1.25;
    
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
    
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    public void incrementSpeed(double amount){
        setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount,getEnginePower()));
    }

    public void decrementSpeed(double amount){
        setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount, 0));
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }



    // Implementation of Movable

    public void move() {
        
        // Get direction as point (dx, dy)
        Point direction = getDirectionArray()[getDirectionIndex()];
        int dx = (int)direction.getX();
        int dy = (int)direction.getY();

        // Calculate new coordinates
        int newX = dx * (int)getCurrentSpeed();
        int newY = dy * (int)getCurrentSpeed();

        // Set coordinates
        setX(newX);
        setY(newY);

    }

    public void turnLeft() {

        if (getDirectionIndex() == 0) {
            setDirectionIndex(getDirectionArray().length - 1);
        }
        else {
            setDirectionIndex(getDirectionIndex() - 1);
        }

    }

    public void turnRight() {

        if (getDirectionIndex() == getDirectionArray().length - 1) {
            setDirectionIndex(0);
        }
        else {
            setDirectionIndex(getDirectionIndex() + 1);
        }
        
    }



}
