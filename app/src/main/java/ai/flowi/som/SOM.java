package ai.flowi.som;

import java.util.ArrayList;

import ai.flowi.som.SOMNeuron;
import ai.flowi.data.InputVector;

public class SOM<V extends InputVector<V>, L> {
    private final long iterations;

    private double learningRate;
    private final double maxLearningRate;

    private int neighbourHoodRadius;
    private final int maxNeighbourHoodRadius;

    private ArrayList<SOMNeuron<V, L>> input;

    public SOM(long iterations, double learningRate, double maxLearningRate, int neighbourHoodRadius,
            int maxNeighbourHoodRadius, ArrayList<SOMNeuron<V,L>> input) {
        this.iterations = iterations;
        this.learningRate = learningRate;
        this.maxLearningRate = maxLearningRate;
        this.neighbourHoodRadius = neighbourHoodRadius;
        this.maxNeighbourHoodRadius = maxNeighbourHoodRadius;
        this.input = input;
    }
}
