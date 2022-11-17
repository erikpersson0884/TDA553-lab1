package cars;
import java.awt.*;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;


public class Volvo240Test {


    @Test
    public void gas_should_only_accept_value_between_one_and_zero() {

        Volvo240 volvo = new Volvo240();
        assertThrows(IllegalArgumentException.class, () -> volvo.gas(-0.1));
        assertThrows(IllegalArgumentException.class, () -> volvo.gas(1.1));

    }

    @Test
    public void brake_should_only_accept_value_between_one_and_zero() {

        Volvo240 volvo = new Volvo240();
        assertThrows(IllegalArgumentException.class, () -> volvo.brake(-0.1));
        assertThrows(IllegalArgumentException.class, () -> volvo.brake(1.1));

    }

    @Test
    public void gas_should_change_coordinates() {

        Volvo240 volvo = new Volvo240();
        Point oldCoordinate = volvo.getCoordinate();
        volvo.gas(1);
        volvo.move();
        Point newCoordinate = volvo.getCoordinate();
        assertNotEquals(oldCoordinate, newCoordinate);

    }

    @Test
    public void turn_should_change_direction() {

        Volvo240 volvo = new Volvo240();
        Point directionOne = volvo.getDirection();
        volvo.turnLeft();
        Point directionTwo = volvo.getDirection();
        assertNotEquals(directionOne, directionTwo);


    }

    @Test
    public void incrementSpeed_should_increase_current_speed() {

        Volvo240 volvo = new Volvo240();
        volvo.incrementSpeed(10);
        double oldSpeed = volvo.getCurrentSpeed();
        volvo.incrementSpeed(5);
        double newSpeed = volvo.getCurrentSpeed();
        assertTrue(newSpeed > oldSpeed);

    }

    @Test
    public void decrementSpeed_should_decrease_current_sped() {

        Volvo240 volvo = new Volvo240();
        volvo.incrementSpeed(100);
        double oldSpeed = volvo.getCurrentSpeed();
        volvo.brake(1);
        double newSpeed = volvo.getCurrentSpeed();
        assertTrue(newSpeed < oldSpeed);

    }

    @Test
    public void stop_engine_should_make_current_speed_zero() {
        
        Volvo240 volvo = new Volvo240();
        volvo.setCurrentSpeed(100);
        volvo.stopEngine();
        assertEquals(0, volvo.getCurrentSpeed(), 0);
        
    }


  }