package ai.flowi.flowers;

import ai.flowi.data.Data;

public class FlowerData extends Data<FlowerVector, String> {

    public FlowerData(FlowerVector vector, String label) {
        this.vector = vector;
        this.label = label;
    }

}
