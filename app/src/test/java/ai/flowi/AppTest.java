package ai.flowi;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import ai.flowi.files.CSVReader;

class AppTest {
    @Test
    void readLineTest() {
        String path = Thread.currentThread()
                .getContextClassLoader()
                .getResource("iris_dataset.csv")
                .getPath();
        try (var reader = new CSVReader(path)) {
            List<String[]> lines = reader.read();
            String[] firstLine = lines.getFirst();
            assertArrayEquals(firstLine, new String[] { "5.1", "3.5", "1.4", "0.2", "setosa" });
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
