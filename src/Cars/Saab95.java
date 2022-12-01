package Cars;

import java.awt.*;
import java.math.BigDecimal;

public class Saab95 implements ICar, Movable, IPositonable {
    private TurboCar turboCar;

    public Saab95(double enginePower, Color color, double x, double y) {
        this.turboCar = new TurboCar("Saab95", enginePower, color, 2, x, y);
    }

    @Override
    public void move() {
        turboCar.move();
    }

    @Override
    public void turnLeft() {
        turboCar.turnLeft();
    }

    @Override
    public void turnRight() {
        turboCar.turnRight();
    }

    @Override
    public void gas(double amount) {
        turboCar.gas(amount);
    }

    @Override
    public void brake(double amount) {
        turboCar.brake(amount);
    }

    @Override
    public double getEnginePower() {
        return turboCar.getEnginePower();
    }

    @Override
    public double getCurrentSpeed() {
        return turboCar.getCurrentSpeed();
    }

    @Override
    public BigDecimal getX() {
        return turboCar.getX();
    }

    @Override
    public BigDecimal getY() {
        return turboCar.getY();
    }
}
