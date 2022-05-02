import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class skillDemo {

    /**
     * Print all elements starting from inputted index
     * 
     * @param index
     */
    public static ArrayList<String> printElements(String[] array, int idx) {
        ArrayList<String> toReturn = new ArrayList<>();
        for (int i = idx; i < array.length; i++) {
            toReturn.add(array[i]);
        }
        return toReturn;
    }

    public static void main(String[] args) throws IOException {
        List<String> input = new ArrayList<String>();
        Path fileName = Path.of("test-file.md");

        input = Files.readAllLines(fileName);

        String[] array = input.toArray(new String[0]);

        System.out.print(printElements(array, 0));
    }
}
