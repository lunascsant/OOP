package Loja.RH;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColaboradorMarketingTest {

    ColaboradorMarketing colaboradorMarketing;

    @BeforeEach
    void setUp () {
        colaboradorMarketing = new ColaboradorMarketing();
        colaboradorMarketing.setNome("Maria Silva");
        colaboradorMarketing.setCpf("222.222.222-00");
        colaboradorMarketing.setSalarioBase(3000.0f);
        colaboradorMarketing.setValorINSS(360.0f);
        colaboradorMarketing.setValeTransporte(160.0f);
        colaboradorMarketing.setAdicionalPorMetasCumpridas(300.0f);
    }

    @Test
    void deveRetornarNome () {
        assertEquals("Maria Silva", colaboradorMarketing.getNome());
    }

    @Test
    void deveRetornarSalarioBase () {
        assertEquals(3000.0f, colaboradorMarketing.getSalarioBase());
    }

    @Test
    void deveRetornarCpf () {
        assertEquals("222.222.222-00", colaboradorMarketing.getCpf());
    }

    @Test
    void deveRetornarValeTransporte () {
        assertEquals(160.0f, colaboradorMarketing.getValeTransporte());
    }

    @Test
    void deveRetornarValorINSS () {
        assertEquals(360.0f, colaboradorMarketing.getValorINSS());
    }

    @Test
    void deveRetornarAdicionalPorMetasCumpridas () {
        assertEquals(300.0f, colaboradorMarketing.getAdicionalPorMetasCumpridas());
    }

    @Test
    void deveCalcularSalarioLiquido() {
        assertEquals(2780.0f, colaboradorMarketing.calcularSalarioLiquido());
    }
}