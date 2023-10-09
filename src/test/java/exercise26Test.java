import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class exercise26Test {
    @Test
    public void TestMain(){
        int[] array = {1,2,3};
        int[] expectedRes = {3,2,1};

        int [] actualRes = exercise26.calc(array);
        assertArrayEquals(expectedRes,actualRes);
    }

}