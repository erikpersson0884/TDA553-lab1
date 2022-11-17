package cars;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Saab95Test {
  @Test
  public void runItBackTurbo() {
    Saab95 testSaab = new Saab95();
    assertTrue(testSaab.speedFactor() == testSaab.getEnginePower()*0.01);
    testSaab.setTurboOn();
    assertTrue(testSaab.speedFactor() == testSaab.getEnginePower()*0.01*1.3);
    testSaab.setTurboOff();
    assertTrue(testSaab.speedFactor() == testSaab.getEnginePower()*0.01);
    }
  }