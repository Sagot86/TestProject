package array;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * ArrayCounterTest.
 *
 * @author Igor_Orlov
 */
public class ArrayCounterTest {

    private final ArrayCounter counter = new ArrayCounter();
    private final Element[][] testArray = ArrayInitializer.getFilledElementsArray(3, 3);

    @Test
    public void testNormalCase() {
        Element testElem = new Element(0, 1);
        List<Element> expected = Arrays.asList(
                new Element(0, 0),
                new Element(1, 0),
                new Element(1, 1),
                new Element(1, 2),
                new Element(0, 2)
        );

        List<Element> surround = counter.getSurroundings(testArray, testElem);
        assertEquals(surround.size(), expected.size());
        assertTrue(surround.containsAll(expected));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testOutOfRangeYCoordCase() {
        Element testElem = new Element(1, -33);
        counter.getSurroundings(testArray, testElem);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testOutOfRangeXCoordCase() {
        Element testElem = new Element(11, 0);
        counter.getSurroundings(testArray, testElem);
    }
}
