package test.cars;


import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class Saab95Test {
  @Test
  public void number_of_doors_should_be_2() {
    Saab95 saab95 = new Saab95();
    assertEquals(2,saab95.getNrDoors());
  }
  }