package ai.flowi.flowers;

public class FlowerParser {
    public static SOMNeuron parseFlower(String[] row) {
        double sepalLength = Double.parseDouble(row[1]);
        double sepalWidth = Double.parseDouble(row[2]);
        double petalLength = Double.parseDouble(row[3]);
        double petalWidth = Double.parseDouble(row[4]);
        String label = row[5];
    }
}
