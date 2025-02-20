package ai.flowi.data;

/**
 * Represents a vector with the capacity
 * of calculate it's euclidean distance with
 * another vector that is encouraged to be of the same type.
 * 
 * @type T the type of the vector (must be the same as the implementor)
 * @type L the label
 */
public interface Vector<T extends Vector<T>> {

    /**
     * Euclidean distance between two vectors
     * 
     * @param other the other vector
     */
    double distance(T other);

    double get(int axis);

    void setDimension(double value, int axis);
}
