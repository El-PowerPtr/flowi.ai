package ai.flowi.data;

/**
 * Represents a vector with the capacity
 * of calculate it's euclidean distance with
 * another vector that is encouraged to be of the same type.
 * 
 * @type T the type of the vector (must be the same as the implementor)
 */
public interface InputVector<T extends InputVector<T>> {

    /**
     * Euclidean distance between two vectors
     * 
     * @param other the other vector
     */
    public double distance(T other);

    void setDimension(double value, int axis);
}
