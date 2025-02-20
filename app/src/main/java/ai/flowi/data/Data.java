package ai.flowi.data;

public interface Data<V extends Vector<V>, L> extends Vector<V> {
    L getLabel();
}
