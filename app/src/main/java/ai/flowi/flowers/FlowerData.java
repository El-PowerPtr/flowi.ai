package ai.flowi.flowers;

import ai.flowi.data.Data;

public class FlowerData implements Data<FlowerVector, String> {
    private FlowerVector vector;
    private String label;

    public FlowerData(FlowerVector vector, String label) {
        this.vector = vector;
        this.label = label;
    }

    @Override
    public double distance(FlowerVector other) {
        return vector.distance(other);
    }

    @Override
    public void setDimension(double value, int axis) {
        vector.setDimension(value, axis);
    }

    @Override
    public String getLabel() {
        return label;
    }

    public FlowerVector getVector() {
        return vector;
    }

    @Override
    public double get(int axis) {
        return vector.get(axis);
    }

}
