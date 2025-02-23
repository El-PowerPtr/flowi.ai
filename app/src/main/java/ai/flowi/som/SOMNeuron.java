package ai.flowi.som;

import java.util.ArrayList;

import ai.flowi.data.Vector;
import ai.flowi.data.VectorHolder;

public class SOMNeuron<V extends Vector<V>> implements VectorHolder<V> {
    private V vector;
    private ArrayList<SOMNeuron<V>> neighbourHood;

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
    public void setDimension(double value, int axis) {
        vector.setDimension(value, axis);
    }

    @Override
    public double get(int axis) {
        return vector.get(axis);
    }

    @Override
    public int size() {
        return vector.size();
    }

    @Override
    public double distance(VectorHolder<V> other) {
        return vector.distance(other.getVector());
    }

    public ArrayList<SOMNeuron<V>> getNeighbourHood() {
        return neighbourHood;
    }

    public void setNeighbourHood(ArrayList<SOMNeuron<V>> neighbourHood) {
        this.neighbourHood = neighbourHood;
    }

}
