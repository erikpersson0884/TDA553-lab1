import java.awt.*;

public abstract class Car {

    // Shared Attributes
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name


    // GETTERS AND SETTERS
    protected int getNrDoors() {
        return nrDoors;
    }

    protected void setNrDoors(int nrDoors) {
        this.nrDoors = nrDoors;
    }

    protected double getEnginePower() {
        return enginePower;
    }

    protected void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    protected double getCurrentSpeed() {
        return currentSpeed;
    }

    protected void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    protected Color getColor() {
        return color;
    }

    protected void setColor(Color color) {
        this.color = color;
    }

    protected String getModelName() {
        return modelName;
    }

    protected void setModelName(String modelName) {
        this.modelName = modelName;
    }


    // METHODS
    protected void startEngine(){
	    currentSpeed = 0.1;
    }

    protected void stopEngine(){
	    currentSpeed = 0;
    }


    // Abstract methods
    abstract protected double speedFactor();

    abstract protected void incrementSpeed(double amount);

    abstract protected void decrementSpeed(double amount);



}