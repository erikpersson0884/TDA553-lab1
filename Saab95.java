import java.awt.*;

public class Saab95 extends Car{

    // Specific attributes
    private boolean turboOn;

    public Saab95(){
        setNrDoors(2);
        setColor(Color.red);
        setEnginePower(125);
        setModelName("Saab95");
        turboOn = false;
        stopEngine();
    }


    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }
    
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    public void incrementSpeed(double amount){
        setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
    }

    public void decrementSpeed(double amount){
        setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
    }
    


    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
}
