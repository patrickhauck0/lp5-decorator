package org.example.decorator;

public abstract class AcaiDecorator implements Acai {
    private Acai acai;

    public AcaiDecorator (Acai acai) { this.acai = acai; }

    public Acai getAcai() {
        return acai;
    }

    public void setAcai(Acai acai) {
        this.acai = acai;
    }

    public abstract float getValorDoAdicional();

    public float getValorDoCopo() {
        return this.acai.getValorDoCopo() + this.getValorDoAdicional();
    }
}
