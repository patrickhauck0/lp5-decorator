package org.example.decorator;

public class Cobertura extends AcaiDecorator {
    public Cobertura(Acai acai) {
        super(acai);
    }

    public float getValorDoAdicional() { return 5.0f; }
}
