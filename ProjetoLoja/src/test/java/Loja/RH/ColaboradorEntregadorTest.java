package Loja.RH;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColaboradorEntregadorTest {

    ColaboradorEntregador colaboradorEntregador;

    @BeforeEach
    void setUp () {
        colaboradorEntregador = new ColaboradorEntregador();
        colaboradorEntregador.setNome("João Silva");
        colaboradorEntregador.setCpf("222.222.222-90");
        colaboradorEntregador.setSalarioBase(2000.0f);
        colaboradorEntregador.setValorINSS(180.0f);
        colaboradorEntregador.setValeTransporte(0.0f);
        colaboradorEntregador.setAuxilioManutencaoVeiculo(500.0f);
        colaboradorEntregador.setPedidosEntregues(10);
        colaboradorEntregador.setValorExtraPorPedidoEntregue(5.0f);
    }

    @Test
    void deveRetornarNome () {
        assertEquals("João Silva", colaboradorEntregador.getNome());
    }

    @Test
    void deveRetornarSalarioBase () {
        assertEquals(2000.0f, colaboradorEntregador.getSalarioBase());
    }

    @Test
    void deveRetornarCpf () {
        assertEquals("222.222.222-90", colaboradorEntregador.getCpf());
    }

    @Test
    void deveRetornarValeTransporte () {
        assertEquals(0.0f, colaboradorEntregador.getValeTransporte());
    }

    @Test
    void deveRetornarValorINSS () {
        assertEquals(180.0f, colaboradorEntregador.getValorINSS());
    }

    @Test
    void deveRetornarAuxilioManutencaoVeiculo () {
        assertEquals(500.0f, colaboradorEntregador.getAuxilioManutencaoVeiculo());
    }

    @Test
    void deveRetornarPedidosEntregues () {
        assertEquals(10, colaboradorEntregador.getPedidosEntregues());
    }

    @Test
    void deveRetornarValorExtraPorPedidoEntregue () {
        assertEquals(5.0f, colaboradorEntregador.getValorExtraPorPedidoEntregue());
    }


    @Test
    void deveCalcularSalarioLiquido() {
        assertEquals(1870.0f, colaboradorEntregador.calcularSalarioLiquido());
    }
}