package ai.flowi.som;

import ai.flowi.data.InputVector;

public class SOMNeuron<V extends InputVector<V>, L> {
    public V vector;
    public L label;

    public SOMNeuron(V vector, L label) {
        this.vector = vector;
        this.label = label;
    }

    // Getters ------------------------------------------------------------------
    public V getVector() {
        return vector;
    }

        public L getLabel() {
        return label;
    }
    //---------------------------------------------------------------------------

    //Setters -------------------------------------------------------------------
    public void setVector(V vector) {
        this.vector = vector;
    }


    public void setLabel(L label) {
        this.label = label;
    }
    //---------------------------------------------------------------------------
}
