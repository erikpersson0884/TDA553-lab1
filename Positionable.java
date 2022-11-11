
public abstract class Positionable {
    // Instance variables
    private double x;
    private double y;
    private double direction; // Direction (based on the unit circle)

    // Constructor
    public Positionable(double x, double y, double direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    // Methods for getters and setters
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

    protected double getDirection() {
        return direction;
    }

    protected void setDirection(double newDirection) {
        this.direction = newDirection;
    } 
}