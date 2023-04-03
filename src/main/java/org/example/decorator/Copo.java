package org.example.decorator;

public class Copo implements Acai {
    private float valorDoCopo;

    public Copo() {}
    public Copo(float valorDoCopo) {
        this.valorDoCopo = valorDoCopo;
    }

    public float getValorDoCopo() {
        return valorDoCopo;
    }
}
