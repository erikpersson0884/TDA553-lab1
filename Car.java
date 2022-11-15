import java.awt.*;

public abstract class Car implements Movable {

    // Shared Attributes
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name

    // Coordinates
    private int x, y;

    // Moving
    private Point[] directions = new Point[]{new Point(0,1), new Point(1,0), new Point(0,-1), new Point(-1,0)};
    private int directionIndex;
    


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

    protected int getX() {
        return x;
    }

    protected void setX(int x) {
        this.x = x;
    }

    protected int getY() {
        return y;
    }

    protected void setY(int y) {
        this.y = y;
    }

    protected int getDirectionIndex() {
        return directionIndex;
    }

    protected void setDirectionIndex(int directionIndex) {
        this.directionIndex = directionIndex;
    }

    protected Point[] getDirectionArray() {
        return directions;
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


   // Implementation of Movable

   public void move() {
        
        // Get direction as point (dx, dy)
        Point direction = getDirectionArray()[getDirectionIndex()];
        int dx = (int)direction.getX();
        int dy = (int)direction.getY();

        // Calculate new coordinates
        int newX = x + dx * (int)getCurrentSpeed();
        int newY = y + dy * (int)getCurrentSpeed();

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

protected void gas(double amount) {

    try {
        if (amount < 0 || amount > 1) {
            throw new Exception("Gas amount out of limit!");
        }
        else {
            incrementSpeed(amount);
        }

    }
    catch (Exception e) {
        System.out.println("Exception occured " + e);
    }

}

protected void brake(double amount) {

    try {
        if (amount < 0 || amount > 1) {
            throw new Exception("Brake amount out of limit!");
        }
        else {
            decrementSpeed(amount);
        }

    }
    catch (Exception e) {
        System.out.println("Exception occured " + e);
    }

}


protected void incrementSpeed(double amount){
    setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount,getEnginePower()));
}

protected void decrementSpeed(double amount){
    setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount, 0));
}

}