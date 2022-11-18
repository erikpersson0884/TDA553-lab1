package cars;

import java.awt.*;

public abstract class Car implements Movable {

    ////// Shared Attributes //////

    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name


    private int x, y = 0; // Coordinates

    // Directions presented as Points
    private Point[] directions = new Point[] { new Point(0, 1), new Point(1, 0), new Point(0, -1), new Point(-1, 0) };

    private int directionIndex; // Active index in directions.

    
    // Constructor
    public Car(int nrDoors, double enginePower, Color color, String modelName) {
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.currentSpeed = 0;
        this.color = color;
        this.modelName = modelName;
        directionIndex = 0;
    }

    ////////////// GETTERS AND SETTERS ////////////////////

    public Point getCoordinate() {
        return new Point(x, y);
    }

    public int getNrDoors() {
        return nrDoors;
    }

    public void setNrDoors(int nrDoors) {
        this.nrDoors = nrDoors;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    private void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    protected int getDirectionIndex() {
        return directionIndex;
    }

    protected void setDirectionIndex(int directionIndex) {
        this.directionIndex = directionIndex;
    }

    protected Point[] getDirectionArray() {
        return directions.clone();
    }

    protected Point getDirection() {
        return directions[getDirectionIndex()];
    }


    //////////// METHODS ///////////////


    public void startEngine() {
        currentSpeed = 0.1;
    }

    public void stopEngine() {
        currentSpeed = 0;
    }

    // Abstract methods
    abstract protected double speedFactor();

    // Implementation of Movable

    public void move() {

        // Get direction as point (dx, dy)
        Point direction = getDirectionArray()[getDirectionIndex()];
        int dx = (int) direction.getX();
        int dy = (int) direction.getY();

        // Calculate new coordinates
        int newX = x + dx * (int) getCurrentSpeed();
        int newY = y + dy * (int) getCurrentSpeed();

        // Set coordinates
        setX(newX);
        setY(newY);

    }

    // Change active index in Direction Array to (current index - 1).
    public void turnLeft() {

        if (getDirectionIndex() == 0) {
            setDirectionIndex(getDirectionArray().length - 1);
        } else {
            setDirectionIndex(getDirectionIndex() - 1);
        }

    }

    // Change active index in Direction Array to (current index + 1).
    public void turnRight() {

        if (getDirectionIndex() == getDirectionArray().length - 1) {
            setDirectionIndex(0);
        } else {
            setDirectionIndex(getDirectionIndex() + 1);
        }

    }

    // Gas method. But check that the amount is between 0-1. If not throw exception.
    public void gas(double amount) {

        if (amount < 0 || amount > 1) {
            throw new IllegalArgumentException();
        } else {
            incrementSpeed(amount);
        }

    }

    // Brake method. But check that amount is between 0-1. If not throw exception.
    public void brake(double amount) {

        if (amount < 0 || amount > 1) {
            throw new IllegalArgumentException();
        } else {
            decrementSpeed(amount);
        }

    }

    // Increase speed but make sure it never goes above Engine Power.
    protected void incrementSpeed(double amount) {
        setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower()));
    }

    // Decrease speed but make sure it never goes below 0.
    protected void decrementSpeed(double amount) {
        setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount, 0));
    }

}