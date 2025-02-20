package ai.flowi.som;

import java.util.ArrayList;

import ai.flowi.data.Data;
import ai.flowi.data.Vector;

public class SOM<V extends Vector<V>, L> {
    private final long iterations;

    private double learningRate;
    private final double maxLearningRate;

    private int neighbourHoodRadius;
    private final int maxNeighbourHoodRadius;

    private ArrayList<SOMNeuron<V>> neurons;

    public SOM(long iterations, double learningRate, double maxLearningRate, int neighbourHoodRadius,
            int maxNeighbourHoodRadius, ArrayList<SOMNeuron<V>> neurons) {
        this.iterations = iterations;
        this.learningRate = learningRate;
        this.maxLearningRate = maxLearningRate;
        this.neighbourHoodRadius = neighbourHoodRadius;
        this.maxNeighbourHoodRadius = maxNeighbourHoodRadius;
        this.neurons = neurons;
    }

    public void changeWeights(Data<V,L> data, SOMNeuron<V> )
}
