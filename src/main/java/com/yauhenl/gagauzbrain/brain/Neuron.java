package com.yauhenl.gagauzbrain.brain;

import com.yauhenl.gagauzbrain.Matrix;

import java.util.ArrayList;
import java.util.List;

public class Neuron {
    private Axon axon;
    private List<Dendrite> dendrites;

    public Neuron() {
        axon = new Axon(this);
        Matrix.getInstance().addAxon(axon);
        dendrites = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            addDendrite();
        }
    }

    private void addDendrite() {
        Dendrite dendrite = new Dendrite(this);
        dendrites.add(dendrite);
        Matrix.getInstance().addFreeDendrite(dendrite);
    }
}
