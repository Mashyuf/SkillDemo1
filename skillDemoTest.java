import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class skillDemoTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    
    @Test
    public void testFileIndex0() throws IOException {
        List<String> input = new ArrayList<String>();
        Path fileName = Path.of("test-file.md");
        input = Files.readAllLines(fileName);
        String[] array = input.toArray(new String[0]);

        assertEquals("[1, 2, 3, 4, 5]", skillDemo.printElements(array, 0).toString());
    }

    @Test
    public void testFileIndex1() throws IOException {
        List<String> input = new ArrayList<String>();
        Path fileName = Path.of("test-file.md");
        input = Files.readAllLines(fileName);
        String[] array = input.toArray(new String[0]);

        assertEquals("[2, 3, 4, 5]", skillDemo.printElements(array, 1).toString());
    }
}
