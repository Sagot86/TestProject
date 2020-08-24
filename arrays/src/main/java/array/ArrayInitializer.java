package array;

import lombok.experimental.UtilityClass;

/**
 * ArrayInitializer.
 *
 * @author Igor_Orlov
 */
@UtilityClass
public class ArrayInitializer {

    public Element[][] getFilledElementsArray(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IndexOutOfBoundsException();
        }
        return createArray(x, y);
    }

    private Element[][] createArray(int x, int y) {
        Element[][] elements = new Element[x][y];
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                elements[i][j] = new Element(i, j);
            }
        }
        return elements;
    }
}
