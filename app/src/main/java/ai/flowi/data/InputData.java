package ai.flowi.data;

import ai.flowi.data.VectorHolder;

public abstract class InputData<V extends Vector<V>, L> implements VectorHolder<V> {

    protected L label;
    protected V vector;

    @Override
    public double get(int axis) {
        return vector.get(axis);
    }

    @Override
    public double distance(VectorHolder<V> other) {
        return vector.distance(other.getVector());
    }

    @Override
    public void setDimension(double value, int axis) {
        vector.setDimension(value, axis);
    }

    @Override
    public int size() {
        return vector.size();
    }

    public L getLabel() {
        return label;
    }

    public V getVector() {
        return vector;
    }
}
