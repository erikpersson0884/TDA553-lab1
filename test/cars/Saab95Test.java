package cars;


import static org.junit.Assert.assertEquals;
import org.junit.Test;


/*public class ARSetTest {
  @Test
  public void empty_set_should_have_size_zero() {
    ARSet emptySet = new ARSet();
    assertEquals(0, emptySet.size());
  }
}*/

public class Saab95Test {

    @Before
    static public void test_started() {
        System.out.println("Test started!");
    }

    @Test
    public void number_of_doors_should_not_be_zero() {
        Saab95 saab95 = new Saab95();
        assertEquals(2, saab95.getNrDoors());
    }

}
