import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Random;

class exercise6Test {
    @Test
    public void testLocalMin() {
        int[] array = {5, 1, 3, 8, 2, 6, 4, 7, 9};
        int[] expected = {1, 2, 4};
        int[] result = exercise6.findLocalMin(array);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        int[] result = exercise6.findLocalMin(array);
        assertEquals(0, result.length);
    }



}