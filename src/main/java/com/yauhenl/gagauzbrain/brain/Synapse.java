package com.yauhenl.gagauzbrain.brain;

import com.yauhenl.gagauzbrain.Matrix;

public class Synapse {
    private Axon axon;
    private Dendrite dendrite;
    private Integer value;
    private Type type;

    public Synapse(Axon axon, Dendrite dendrite, Type type) {
        this.axon = axon;
        this.dendrite = dendrite;
        this.type = type;
        value = 100;
        axon.addSynapse(this);
        dendrite.setSynapse(this);
        System.out.println("Synapse " + type);
    }

    public Axon getAxon() {
        return axon;
    }

    public void setAxon(Axon axon) {
        this.axon = axon;
    }

    public Dendrite getDendrite() {
        return dendrite;
    }

    public void setDendrite(Dendrite dendrite) {
        this.dendrite = dendrite;
    }

    public enum Type {
        positive,
        negative;

        public static Type get(Integer i) {
            if (i == 0) {
                return negative;
            }
            return positive;
        }
    }

    private void destroy() {
        dendrite.removeSynapse();
        axon.removeSynapse(this);
        Matrix.getInstance().addFreeDendrite(dendrite);
    }
}
