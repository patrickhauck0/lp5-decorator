package org.example.decorator;

public class LeiteNinho extends AcaiDecorator {
    public LeiteNinho(Acai acai) {
        super(acai);
    }

    public float getValorDoAdicional() { return 7.0f; }
}
