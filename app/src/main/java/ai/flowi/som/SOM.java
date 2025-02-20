package ai.flowi.som;

import java.util.ArrayList;

import ai.flowi.data.Data;
import ai.flowi.data.Vector;

public class SOM<V extends Vector<V>, L> {
    private final long iterations;

    private double learningRate;
    private final double maxLearningRate;

    private double neighbourHoodRadius;
    private final double maxNeighbourHoodRadius;

    private ArrayList<SOMNeuron<V>> neurons;
    private ArrayList<Data<V, L>> input;

    public SOM(long iterations, double learningRate, double maxLearningRate, int neighbourHoodRadius,
            int maxNeighbourHoodRadius, ArrayList<SOMNeuron<V>> neurons) {
        this.iterations = iterations;
        this.learningRate = learningRate;
        this.maxLearningRate = maxLearningRate;
        this.neighbourHoodRadius = neighbourHoodRadius;
        this.maxNeighbourHoodRadius = maxNeighbourHoodRadius;
        this.neurons = neurons;
    }

    public SOMNeuron<V> getBMU(Data<V, L> data) {
        return neurons.stream()
                .min((x, y) -> Double.compare(x.getVector().distance(data.getVector()),
                        y.getVector().distance(data.getVector())))
                .get();
    }

    public void changeWeights(Data<V, L> data, SOMNeuron<V> bestMatchingUnit, double distance, int iteration) {
        int weights = data.size();
        for (int i = 0; i < weights; i++) {
            bestMatchingUnit.setDimension(bestMatchingUnit.get(i) + learningRate * neighbourHoodRadius * data.get(i)
                    - bestMatchingUnit.get(i), i);
        }
        neighbourHoodRadius = Math
                .exp(-1 * Math.pow(distance, 2) / (2 * Math.pow(neurons.size() / (2.0 * iteration),2) ));
        learningRate = maxLearningRate * Math.exp(iteration * 1.0 / iterations);
    }
}
