package org.example.decorator;

public class Amendoim extends AcaiDecorator {
    public Amendoim(Acai acai) {
        super(acai);
    }

    public float getValorDoAdicional() { return 3.0f; }
}
