package org.example.decorator;

public class Fruta extends AcaiDecorator {
    public Fruta(Acai acai) {
        super(acai);
    }

    public float getValorDoAdicional() { return 4.50f; }
}
