package cars;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Saab95Test {
  Saab95 testSaab = new Saab95();
  @Test 
  public void see_if_speedfactor_is_correctly_calculated() {
    assertTrue(testSaab.speedFactor() == testSaab.getEnginePower()*0.01);
  }
  @Test
  public void see_if_turbo_method_change_speedfactor_according_to_plans() {
    assertTrue(testSaab.speedFactor() == testSaab.getEnginePower()*0.01);
    testSaab.setTurboOn();
    assertTrue(testSaab.speedFactor() == testSaab.getEnginePower()*0.01*1.3);
    testSaab.setTurboOff();
    assertTrue(testSaab.speedFactor() == testSaab.getEnginePower()*0.01);
    }
  }