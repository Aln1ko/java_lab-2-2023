import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Exercise16Test {

    @Test
    public void testFindElement() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(Integer.valueOf(2), exercise16.findElement(array, 3));
        assertNull(exercise16.findElement(array, 6));
    }


    @Test
    public void testMain() {
        final int SIZE = 10;
        int[] expectedArray = {-3, -2, -1, 0, 1, 2, 7, 8, 9, 10, 11, 12};
        int[] arrayA = new int[SIZE];
        int[] arrayB = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arrayA[i] = i - 3;
            arrayB[i] = i + 3;
        }
        int [] actuallArray = exercise16.findNewArray(arrayA,arrayB);

        for (int i = 0; i < expectedArray.length; i++) {
            assertEquals(actuallArray[i], expectedArray[i]);
        }
    }
}