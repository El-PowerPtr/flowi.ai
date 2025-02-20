package ai.flowi.flowers;

import ai.flowi.data.Vector;

public class FlowerVector implements Vector<FlowerVector> {
    private double[] dimensions;
    private final static int size = 4;

    public FlowerVector(double sepalLength, double sepalWidth, double petalLength, double petalWidth) {
        if (sepalLength <= 0) {
            throw new IllegalArgumentException("El largo del sépalo debe ser mayor que 0");
        }
        if (sepalWidth <= 0) {
            throw new IllegalArgumentException("El ancho del sépalo debe ser mayor que 0");
        }
        if (petalLength <= 0) {
            throw new IllegalArgumentException("El largo de los pétalos debe ser mayor que 0");
        }
        if (petalWidth <= 0) {
            throw new IllegalArgumentException("El ancho de los pétalos debe ser mayor que 0");
        }

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
    public void setDimension(double value, int axis) throws IllegalArgumentException {
        if (axis >= 0 && axis < 3)
            dimensions[axis] = value;
        throw new IllegalArgumentException("El índice debe encontrarse entre 0 y 3. Actual: " + axis);
    }

    @Override
    public double get(int axis) throws IllegalArgumentException {
        if (axis >= 0 && axis < 3)
            return dimensions[axis];
        throw new IllegalArgumentException("El índice debe encontrarse entre 0 y 3. Actual: " + axis);
    }

    @Override
    public int size() {
        return size;
    }
}
