package com.yauhenl.gagauzbrain.brain;

public class Dendrite {
    private Neuron neuron;
    private Synapse synapse;

    public Dendrite(Neuron neuron) {
        this.neuron = neuron;
    }

    public Synapse getSynapse() {
        return synapse;
    }

    public void setSynapse(Synapse synapse) {
        this.synapse = synapse;
    }

    public void removeSynapse() {
        synapse = null;
    }
}
