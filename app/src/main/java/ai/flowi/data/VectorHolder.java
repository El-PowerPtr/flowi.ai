package ai.flowi.data;

import ai.flowi.data.Vector;

/**
 * Represents the behavior of any Type that holds a Vector (like Neurons and Datas)
 */
public interface VectorHolder<V extends Vector<V>> {

    /**
     * Euclidean distance between two vectors
     * 
     * @param other the other vector
     */
    double distance(VectorHolder<V> other);

    V getVector();

    void setDimension(double value, int axis);

    /**
     * Gets a dimension of the vector holded
     */
    double get(int axis);

    int size();
}
