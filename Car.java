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

    public void setCurrentSpeed(double currentSpeed) {
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

    public int getDirectionIndex() {
        return directionIndex;
    }

    public void setDirectionIndex(int directionIndex) {
        this.directionIndex = directionIndex;
    }

    public Point[] getDirectionArray() {
        return directions;
    }

    // METHODS
    public void startEngine(){
	    currentSpeed = 0.1;
    }

    public void stopEngine(){
	    currentSpeed = 0;
    }


    // Abstract methods
    abstract public double speedFactor();

    abstract public void incrementSpeed(double amount);

    abstract public void decrementSpeed(double amount);



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

public void gas(double amount) {

    if (amount > 1) {
        incrementSpeed(1);
    }
    else if (amount < 0) {
        incrementSpeed(0);;
    }
    else {
        incrementSpeed(amount);
    }

}

public void brake(double amount) {

    if (amount > 1) {
        decrementSpeed(1);
    }
    else if (amount < 0) {
        decrementSpeed(0);
    }
    else {
        decrementSpeed(amount);
    }

}


}