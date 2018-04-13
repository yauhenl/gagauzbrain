package com.yauhenl.gagauzbrain;

import com.yauhenl.gagauzbrain.brain.Axon;
import com.yauhenl.gagauzbrain.brain.Dendrite;
import com.yauhenl.gagauzbrain.brain.Neuron;
import com.yauhenl.gagauzbrain.brain.Synapse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.yauhenl.gagauzbrain.brain.Synapse.Type.get;

public class Matrix {
    private List<Dendrite> freeDendrites = new ArrayList<>();
    private List<Axon> axons = new ArrayList<>();
    private List<Neuron> neurons = new ArrayList<>();

    private static Matrix instance;
    private Random rnd = new Random();

    private Matrix() {}

    public static Matrix getInstance() {
        if (instance == null) {
            instance = new Matrix();
        }
        return instance;
    }

    public void initialize() {
        for (int i = 0; i < 100; i++) {
            neurons.add(new Neuron());
        }
        regenerateSynapses();
    }

    private void generateSynapse() {
        new Synapse(getRandomAxon(), getFreeDendrite(), get(rnd.nextInt(2)));
    }

    public void regenerateSynapses() {
        while (freeDendrites.size() > 0) {
            generateSynapse();
        }
    }

    public void addFreeDendrite(Dendrite dendrite) {
        freeDendrites.add(dendrite);
    }

    public Dendrite getFreeDendrite() {
        return freeDendrites.remove(0);
    }

    public void addAxon(Axon axon) {
        axons.add(axon);
    }

    public Axon getRandomAxon() {
        return axons.get(rnd.nextInt(axons.size()));
    }
}
