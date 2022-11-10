import java.awt.*;
import java.lang.Math;

public abstract class Car implements Movable{

    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    private double x;
    private double y;
    private double direction;


    public Car(String modelName, double enginePower, Color color, int nrDoors, double x, double y){
        this.modelName = modelName;   
        this.enginePower = enginePower; 
        this.color = color; 
        this.nrDoors = nrDoors;

        this.x = x;
        this.y = y;
        this.direction = 0;
        
        stopEngine();
    }

    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
	    color = clr;
    }

    public void setCurrentSpeed(double newSpeed){
        currentSpeed = newSpeed;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //should be private
    public double getDirection() {
        return this.direction;
    }

    private void setDirection(double newDirection) {
        this.direction = newDirection;
    }  

    public void startEngine(){
	    currentSpeed = 0.1;
    }
    
    protected abstract double speedFactor();
    
    protected abstract void incrementSpeed(double amount);
    
    protected abstract void decrementSpeed(double amount);

    public void stopEngine(){
	    currentSpeed = 0;
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        if (0 <= amount || amount <= 1){
            incrementSpeed(amount);
        } else {
            throw new IllegalArgumentException("Only values [0-1] are accepted.");
        }
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if (0 <= amount || amount <= 1){
            decrementSpeed(amount);
        } else {
            throw new IllegalArgumentException("Only values [0-1] are accepted.");
        }
    }

    // Moving
    @Override
    public void move() {
        setY(getY() + Math.sin(Math.toRadians(getDirection())) * getCurrentSpeed());
        setX(getX() + Math.cos(Math.toRadians(getDirection())) * getCurrentSpeed());          
    }

    @Override
    public void turnLeft() {
        double newDirection = (getDirection() - 45) % 360;
        setDirection(newDirection);        
    }

    @Override
    public void turnRight() {
        double newDirection = (getDirection() + 45) % 360;
        setDirection(newDirection);    
    } 
}
