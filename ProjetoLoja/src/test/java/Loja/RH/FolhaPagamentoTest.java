package Loja.RH;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FolhaPagamentoTest {

    @Test
    void calcularTotalFolhaPagamento() {
        ColaboradorAdministrador colaboradorAdministrador = new ColaboradorAdministrador();
        colaboradorAdministrador.setSalarioBase(5000.0f);
        colaboradorAdministrador.setValeTransporte(160.0f);
        colaboradorAdministrador.setValorINSS(700.0f);
        colaboradorAdministrador.setParticipacaoNosLucros(200.0f);

        ColaboradorEntregador colaboradorEntregador = new ColaboradorEntregador();
        colaboradorEntregador.setSalarioBase(2000.0f);
        colaboradorEntregador.setValorINSS(180.0f);
        colaboradorEntregador.setPedidosEntregues(10);
        colaboradorEntregador.setValorExtraPorPedidoEntregue(5.0f);

        ColaboradorMarketing colaboradorMarketing = new ColaboradorMarketing();
        colaboradorMarketing.setSalarioBase(3000.0f);
        colaboradorMarketing.setValorINSS(360.0f);
        colaboradorMarketing.setValeTransporte(160.0f);
        colaboradorMarketing.setAdicionalPorMetasCumpridas(300.0f);

        List<Colaborador> listaColaboradoresLoja = new ArrayList<Colaborador>();
        listaColaboradoresLoja.add(colaboradorAdministrador);
        listaColaboradoresLoja.add(colaboradorMarketing);
        listaColaboradoresLoja.add(colaboradorEntregador);

        assertEquals(8990.0f, FolhaPagamento.calcularTotalFolhaPagamento(listaColaboradoresLoja));
    }
}