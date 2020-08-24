package array;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayCounter.
 *
 * @author Igor_Orlov
 */
public class ArrayCounter {

    public List<Element> getSurroundings(Element[][] elements, Element el) {
        int x = el.getXCoordinate();
        int y = el.getYCoordinate();

        validateElement(elements, x, y);

        List<Element> neighborhoods = new ArrayList<>();

        for (int i = (x - 1); i <= (x + 1); i++) {
            for (int j = (y - 1); j <= (y + 1); j++) {
                if (i == x && j == y) {
                    continue;
                }
                try {
                    neighborhoods.add(elements[i][j]);
                } catch (ArrayIndexOutOfBoundsException ex) {
                    //no-op
                }
            }
        }
        return neighborhoods;
    }

    private void validateElement(Element[][] elements, int x, int y) {
        if (x < 0 || x > elements.length || y < 0 || y > elements[0].length) {
            throw new ArrayIndexOutOfBoundsException("Element with xCoord=" + x + " & yCoord=" + y + " not in array range");
        }
    }

}
