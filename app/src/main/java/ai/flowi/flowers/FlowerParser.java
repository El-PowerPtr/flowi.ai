package ai.flowi.flowers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlowerParser {
    public static FlowerData parseFlower(String[] row)
            throws NumberFormatException, NullPointerException {
        double sepalLength = Double.parseDouble(row[1]);
        double sepalWidth = Double.parseDouble(row[2]);
        double petalLength = Double.parseDouble(row[3]);
        double petalWidth = Double.parseDouble(row[4]);
        String label = row[5];

        return new FlowerData(new FlowerVector(sepalLength, sepalWidth, petalLength, petalWidth), label);
    }

    public static List<FlowerData> parseFlowerList(List<String[]> rows) {
        return rows.stream()
                .map(FlowerParser::parseFlower)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
