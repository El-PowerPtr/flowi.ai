package ai.flowi.flowers;

import ai.flowi.data.InputData;

public class FlowerData extends InputData<FlowerVector, String> {

    public FlowerData(FlowerVector vector, String label) {
        this.vector = vector;
        this.label = label;
    }

}
