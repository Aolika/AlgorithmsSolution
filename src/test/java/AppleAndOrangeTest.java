import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 3/24/2017.
 */
public class AppleAndOrangeTest {
    @Test
    public void amountFruitsLandedAtHome() throws Exception {
        int[] arr = {-2,2,1};
        assertEquals(1,AppleAndOrange.amountFruitsLandedAtHome(5,3,arr,7,11));

    }

    @Test
    public void amountFriutsLandedAtHomeTest2() throws Exception {
        int[] arr = {5, -6};
        assertEquals(1,AppleAndOrange.amountFruitsLandedAtHome(15,2,arr,7,11));
    }

}
