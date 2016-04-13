import it.pupok.task2.entityTheArray.EntityTheArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


/**
 * Test for the class EntityTheArray
 */
public class EntityTheArrayTest {

    EntityTheArray<Integer> actualArrayList;
    EntityTheArray<Integer> expectedArrayList;

    /**
     * Test for the method getArray
     */
    @Test
    public void testGetArray() {

        assertEquals(actualArrayList, expectedArrayList.getArray());
    }

    /**
     * Test for the method setArray
     */
    @Test
    public void testSetArray() {

        expectedArrayList.setArray(0, 1, 2);
        actualArrayList.setArray(0,1,2);

        assertNotNull(expectedArrayList);
        assertEquals(actualArrayList, expectedArrayList);
    }
}