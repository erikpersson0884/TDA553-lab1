package cars;

import static org.junit.Assert.*;
import org.junit.Test;

public class Saab95Test {

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

