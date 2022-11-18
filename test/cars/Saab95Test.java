package cars;

import static org.junit.Assert.*;
import org.junit.Test;

public class Saab95Test {

  @Test
  public void see_if_turbo_method_change_speedfactor_according_to_plans() {
    Saab95 saab95 = new Saab95();
    assertTrue(saab95.speedFactor() == saab95.getEnginePower()*0.01);
    saab95.setTurboOn();  
    assertTrue(saab95.speedFactor() == saab95.getEnginePower()*0.01*1.3);
    saab95.setTurboOff();
    assertTrue(saab95.speedFactor() == saab95.getEnginePower()*0.01);
    }

  @Test
  public void test_if_turbo_on_gives_correct_speedfactor() {
    Saab95 saab95 = new Saab95();
    saab95.setTurboOn();
    assertEquals(saab95.getEnginePower()* 0.01 * 1.3, saab95.speedFactor(), 0);
  }

  @Test
  public void test_if_turbo_off_gives_correct_speedfactor() {
    Saab95 saab95 = new Saab95();
    saab95.setTurboOn();
    saab95.setTurboOff();
    assertEquals(saab95.getEnginePower() * 0.01, saab95.speedFactor(), 0);
  }


}

