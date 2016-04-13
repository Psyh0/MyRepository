import it.pupok.task2.inverterOfArrays.InverterOfArrays;
import it.pupok.task2.my_exception.MyFirstException;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Test for the class InverterOfArrays
 */
public class InverterOfArraysTest {

    ArrayList<Integer> actualArrayList;
    ArrayList<Integer> expectedArrayList;
    InverterOfArrays inverter;

    /**
     * Test for the method InverterForArray
     * @throws MyFirstException
     */
    @Test
    public void testInverterForArray () throws MyFirstException {
        inverter = new InverterOfArrays();
        actualArrayList = new ArrayList<Integer>();
        expectedArrayList = new ArrayList<Integer>();

        actualArrayList.add(0);
        actualArrayList.add(1);
        actualArrayList.add(2);

        expectedArrayList.add(2);
        expectedArrayList.add(1);
        expectedArrayList.add(0);

        inverter.inverterForArray(expectedArrayList);

        assertEquals(actualArrayList, expectedArrayList);
    }
}