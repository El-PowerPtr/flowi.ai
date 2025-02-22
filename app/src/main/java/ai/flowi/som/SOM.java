package ai.flowi.som;

import java.util.ArrayList;

import ai.flowi.data.InputData;
import ai.flowi.data.Vector;

public class SOM<V extends Vector<V>, L> {
    private final long iterations;

    private final double maxLearningRate;

    private ArrayList<SOMNeuron<V>> neurons;
    private ArrayList<InputData<V, L>> input;

    public SOM(long iterations, double maxLearningRate, ArrayList<InputData<V, L>> input,
            ArrayList<SOMNeuron<V>> neurons) {
        this.iterations = iterations;
        this.maxLearningRate = maxLearningRate;
        this.neurons = neurons;
        this.input = input;
    }

    public SOMNeuron<V> getBMU(InputData<V, L> data) {
        return neurons.stream()
                .min((x, y) -> Double.compare(x.distance(data), y.distance(data)))
                .get();
    }

    public void changeWeights(InputData<V, L> data, SOMNeuron<V> bestMatchingUnit, double distance, int iteration) {
        int weights = data.size();

        double neighbourHoodRadius = Math.exp(-1 * Math.pow(distance, 2)
                / (2 * Math.pow(neurons.size()
                        / (2.0 * iteration), 2)));

        double learningRate = maxLearningRate * Math.exp(iteration * 1.0 / iterations);

        for (int i = 0; i < weights; i++) {
            bestMatchingUnit.setDimension(bestMatchingUnit.get(i) + learningRate * neighbourHoodRadius * data.get(i)
                    - bestMatchingUnit.get(i), i);
        }
    }

    public void train(
        for (var data : input) {

        }
    }
}
