package Loja.RH;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColaboradorAdministradorTest {

    ColaboradorAdministrador colaboradorAdministrador;

    @BeforeEach
    void setUp () {
        colaboradorAdministrador = new ColaboradorAdministrador();
        colaboradorAdministrador.setNome("Arthur Silva");
        colaboradorAdministrador.setCpf("222.222.222-80");
        colaboradorAdministrador.setSalarioBase(5000.0f);
        colaboradorAdministrador.setValeTransporte(160.0f);
        colaboradorAdministrador.setValorINSS(700.0f);
        colaboradorAdministrador.setParticipacaoNosLucros(200.0f);
    }

    @Test
    void deveRetornarNome () {
        assertEquals("Arthur Silva", colaboradorAdministrador.getNome());
    }

    @Test
    void deveRetornarSalarioBase () {
        assertEquals(5000.0f, colaboradorAdministrador.getSalarioBase());
    }

    @Test
    void deveRetornarCpf () {
        assertEquals("222.222.222-80", colaboradorAdministrador.getCpf());
    }

    @Test
    void deveRetornarValeTransporte () {
        assertEquals(160.0f, colaboradorAdministrador.getValeTransporte());
    }

    @Test
    void deveRetornarValorINSS () {
        assertEquals(700.0f, colaboradorAdministrador.getValorINSS());
    }

    @Test
    void deveRetornarParticipacaoNosLucros () {
        assertEquals(200.0f, colaboradorAdministrador.getParticipacaoNosLucros());
    }

    @Test
    void deveCalcularSalarioLiquido() {
        assertEquals(4340.0f, colaboradorAdministrador.calcularSalarioLiquido());
    }
}