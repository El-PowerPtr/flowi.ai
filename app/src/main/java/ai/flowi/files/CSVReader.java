package ai.flowi.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class CSVReader implements AutoCloseable {
    private BufferedReader reader;

    public CSVReader(String path) {
        try {
            reader = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            System.err.println("Error al encontrar el archivo" + path);
        }
    }

    public List<String[]> read() throws IOException {
        return reader.lines()
                .skip(1)
                .map(x -> x.split(","))
                .collect(Collectors.toList());
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }

    public BufferedReader getReader(){
        return reader;
    }

}
