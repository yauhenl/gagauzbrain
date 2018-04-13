package com.yauhenl.gagauzbrain.brain;

import java.util.ArrayList;
import java.util.List;

public class Axon {
    private Neuron neuron;
    private List<Synapse> synapses = new ArrayList<>();

    public Axon(Neuron neuron) {
        this.neuron = neuron;
    }

    public void addSynapse(Synapse synapse) {
        synapses.add(synapse);
    }

    public void removeSynapse(Synapse synapse) {
        synapses.remove(synapse);
    }
}
