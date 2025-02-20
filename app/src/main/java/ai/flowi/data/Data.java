package ai.flowi.data;

import ai.flowi.data.Vector;

public abstract class Data<V extends Vector<V>, L> implements Vector<V> {

    protected L label;
    protected V vector;

    @Override
    public double distance(V other) {
        return vector.distance(other);
    }

    @Override
    public void setDimension(double value, int axis) {
        vector.setDimension(value, axis);
    }

    public L getLabel() {
        return label;
    }

    public V getVector() {
        return vector;
    }

    @Override
    public double get(int axis) {
        return vector.get(axis);
    }

    @Override
    public int size() {
        return vector.size();
    }
}
