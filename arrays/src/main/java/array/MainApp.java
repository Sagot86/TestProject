package array;

/**
 * MainApp.
 *
 * @author Igor_Orlov
 */
public class MainApp {

    public static void main(String[] args) {

        Element[][] elements = ArrayInitializer.getFilledElementsArray(9, 9);

        Element centerElement = new Element(6, 5);

        ArrayCounter counter = new ArrayCounter();

        try {
            System.out.println(counter.getSurroundings(elements, centerElement));
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

    }

}

