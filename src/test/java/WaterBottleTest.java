import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;


public class WaterBottleTest {
    WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle(100);
    }

   @Test
    public void volumeStartsAt100(){
       assertEquals(100, bottle.getVolume());
   }

   @Test
    public void canReduceVolume(){
        assertEquals(90, bottle.reduceVolume());
   }

   @Test
    public void canEmptyBottle(){
        assertEquals(0, bottle.emptyBottle());
   }

   @Test
    public void canRefillBottle(){
        bottle.emptyBottle();
        assertEquals(100, bottle.refillBottle());
   }
}
