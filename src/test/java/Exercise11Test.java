import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise11Test {
    @Test
    public void testValidInput() {
        String[] args = {"5", "10", "6", "8", "9", "12", "4", "2"};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        exercise11.main(args);
        String expectedOutput = "index in array: 3 number: 12\n"+
        "index in array: 4 number: 4\n"+
        "index in array: 5 number: 2\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testInsufficientArguments() {
        String[] args = {"5", "10"};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        exercise11.main(args);
        String expectedOutput = "error, need to enter minimum 3 args\n";
        assertEquals(expectedOutput, outContent.toString());
    }


    @Test
    public void testOutOfRangeNumbers() {
        String[] args = {"5", "10", "11", "12", "3", "4"};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        exercise11.main(args);
        String expectedOutput = "index in array: 0 number: 11\n" +
                "index in array: 1 number: 12\n" +
                "index in array: 2 number: 3\n" +
                "index in array: 3 number: 4\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
