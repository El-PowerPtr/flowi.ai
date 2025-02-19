package ai.flowi.flowers;

import ai.flowi.data.InputVector;

public class FlowerVector implements InputVector<FlowerVector> {
    private double[] dimensions;

    public FlowerVector(double sepalLength, double sepalWidth, double petalLength, double petalWidth) {
        dimensions = new double[] { sepalLength, sepalWidth, petalLength, petalWidth };
    }

    @Override
    public double distance(FlowerVector other) {
        double result = 0.0;

        for (int i = 0; i < 4; i++)
            result += Math.pow(dimensions[i] - other.dimensions[i], 2);

        return Math.sqrt(result);
    }

    @Override
    public void setDimension(double value, int axis) {
        dimensions[axis] = value;
    }

}
