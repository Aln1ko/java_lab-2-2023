import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static java.lang.Double.compare;


class exercise21Test {
    @Test
    public void testFindCoeffs() {
        int[] arrayA = {2, 4};
        int[] arrayB = {1, 3};
        double[] expectedCoeffs = {1.0, 1.0};
        double[] coeffs = exercise21.findCoeffs(arrayA, arrayB);
        assertArrayEquals(expectedCoeffs, coeffs, 0.000001);
    }

    @Test
    public void testCompare() {
        double expectedTrue = 1.0;
        double actualTrue = exercise21.compare(5.0,5.00000001);
        double expectedFalse = 0.0;
        double actualFalse = exercise21.compare(5.0,5.1);
        assertEquals(expectedTrue,actualTrue);
        assertEquals(expectedFalse,actualFalse);
    }

}