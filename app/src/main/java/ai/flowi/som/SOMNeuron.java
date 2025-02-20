package ai.flowi.som;

import ai.flowi.data.Vector;

public class SOMNeuron<V extends Vector<V>> implements Vector<V> {
    public V vector;

    public SOMNeuron(V vector) {
        this.vector = vector;
    }

    // Getters ------------------------------------------------------------------
    public V getVector() {
        return vector;
    }

    // Setters -------------------------------------------------------------------
    public void setVector(V vector) {
        this.vector = vector;
    }

    @Override
    public double distance(V other) {
        return vector.distance(other);
    }

    @Override
    public void setDimension(double value, int axis) {
        vector.setDimension(value, axis);
    }

    @Override
    public double get(int axis) {
        return vector.get(axis);
    }

    @Override
    public int size(){
        return vector.size();
    }
}
