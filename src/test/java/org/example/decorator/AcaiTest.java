package org.example.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcaiTest {
    @Test
    void deveRetornarValorDoAcai() {
        Acai acai = new Copo(30.0f);

        assertEquals(30.0f, acai.getValorDoCopo());
    }

    @Test
    void deveRetornarValorDoAcaiComAmendoim() {
        Acai acai = new Amendoim(new Copo(30.0f));

        assertEquals(33.0f, acai.getValorDoCopo());
    }

    @Test
    void deveRetornarValorDoAcaiComCobertura() {
        Acai acai = new Cobertura(new Copo(30.0f));

        assertEquals(35.0f, acai.getValorDoCopo());
    }

    @Test
    void deveRetornarValorDoAcaiComFruta() {
        Acai acai = new Fruta(new Copo(30.0f));

        assertEquals(34.50f, acai.getValorDoCopo());
    }

    @Test
    void deveRetornarValorDoAcaiComLeiteNinho() {
        Acai acai = new LeiteNinho(new Copo(30.0f));

        assertEquals(37.0f, acai.getValorDoCopo());
    }

    @Test
    void deveRetornarValorDoAcaiComAmendoimMaisCobertura() {
        Acai acai = new Amendoim(new Cobertura(new Copo(30.0f)));

        assertEquals(38.0f, acai.getValorDoCopo());
    }

    @Test
    void deveRetornarValorDoAcaiComAmendoimMaisFruta() {
        Acai acai = new Amendoim(new Fruta(new Copo(30.0f)));

        assertEquals(37.5f, acai.getValorDoCopo());
    }

    @Test
    void deveRetornarValorDoAcaiComAmendoimMaisLeiteNinho() {
        Acai acai = new Amendoim(new LeiteNinho(new Copo(30.0f)));

        assertEquals(40.0f, acai.getValorDoCopo());
    }

    @Test
    void deveRetornarValorDoAcaiComCoberturaMaisAmendoim() {
        Acai acai = new Cobertura(new Amendoim(new Copo(30.0f)));

        assertEquals(38.0f, acai.getValorDoCopo());
    }

    @Test
    void deveRetornarValorDoAcaiComCoberturaMaisFruta() {
        Acai acai = new Cobertura(new Fruta(new Copo(30.0f)));

        assertEquals(39.5f, acai.getValorDoCopo());
    }

    @Test
    void deveRetornarValorDoAcaiComCoberturaMaisLeiteNinho() {
        Acai acai = new Cobertura(new LeiteNinho(new Copo(30.0f)));

        assertEquals(42.0f, acai.getValorDoCopo());
    }

    @Test
    void deveRetornarValorDoAcaiComFrutaMaisAmendoim() {
        Acai acai = new Fruta(new Amendoim(new Copo(30.0f)));

        assertEquals(37.5f, acai.getValorDoCopo());
    }

    @Test
    void deveRetornarValorDoAcaiComFrutaMaisCobertura() {
        Acai acai = new Fruta(new Cobertura(new Copo(30.0f)));

        assertEquals(39.5f, acai.getValorDoCopo());
    }

    @Test
    void deveRetornarValorDoAcaiComFrutaMaisLeiteNinho() {
        Acai acai = new Fruta(new LeiteNinho(new Copo(30.0f)));

        assertEquals(41.5f, acai.getValorDoCopo());
    }

    @Test
    void deveRetornarValorDoAcaiComLeiteNinhoMaisAmendoim() {
        Acai acai = new LeiteNinho(new Amendoim(new Copo(30.0f)));

        assertEquals(40.0f, acai.getValorDoCopo());
    }

    @Test
    void deveRetornarValorDoAcaiComLeiteNinhoMaisCobertura() {
        Acai acai = new LeiteNinho(new Cobertura(new Copo(30.0f)));

        assertEquals(42.0f, acai.getValorDoCopo());
    }

    @Test
    void deveRetornarValorDoAcaiComLeiteNinhoMaisFruta() {
        Acai acai = new LeiteNinho(new Fruta(new Copo(30.0f)));

        assertEquals(41.5f, acai.getValorDoCopo());
    }

    @Test
    void deveRetornarValorDoAcaiComAmendoimMaisCoberturaMaisFrutaMaisLeiteNinho() {
        Acai acai = new Amendoim(new LeiteNinho(new Fruta(new Cobertura(new Copo(30.0f)))));

        assertEquals(49.5f, acai.getValorDoCopo());
    }
}